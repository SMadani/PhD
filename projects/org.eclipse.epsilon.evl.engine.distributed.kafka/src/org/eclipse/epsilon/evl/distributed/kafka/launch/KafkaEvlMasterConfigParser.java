/*********************************************************************
 * Copyright (c) 2019 The University of York.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
**********************************************************************/
package org.eclipse.epsilon.evl.distributed.kafka.launch;

import java.net.URI;
import org.apache.commons.cli.Option;
import org.eclipse.epsilon.evl.distributed.kafka.EvlModuleKafkaMaster;
import org.eclipse.epsilon.evl.distributed.kafka.execute.context.EvlContextKafkaMaster;
import org.eclipse.epsilon.evl.distributed.launch.DistributedEvlMasterConfigParser;

/**
 * 
 *
 * @author Sina Madani
 * @since 1.6
 * @param <J>
 * @param <B>
 */
public class KafkaEvlMasterConfigParser<R extends KafkaEvlRunConfigurationMaster, B extends KafkaEvlRunConfigurationMaster.Builder<R, B>> extends DistributedEvlMasterConfigParser<R, B> {

	private final String localStandaloneOpt = "localStandalone";
	
	public static void main(String... args) {
		new KafkaEvlMasterConfigParser<>().parseAndRun(args);
	}
	
	@SuppressWarnings("unchecked")
	public KafkaEvlMasterConfigParser() {
		this((B) new KafkaEvlRunConfigurationMaster.Builder<>());
	}
	
	public KafkaEvlMasterConfigParser(B builder) {
		super(builder);
		options.addOption(Option.builder("local")
			.longOpt(localStandaloneOpt)
			.desc("Run this program locally, creating the workers and broker on this machine.")
			.build()
		);
	}
	
	@Override
	public void parseArgs(String[] args) throws Exception {
		super.parseArgs(args);
		builder.localStandalone = cmdLine.hasOption(localStandaloneOpt);
		
		if (builder.host == null || builder.host.isEmpty()) {
			builder.host = "tcp://localhost:61616";
		}
		else {
			if (!builder.host.contains("://")) builder.host = "tcp://"+builder.host;
			URI hostUri = new URI(builder.host);
			builder.host = hostUri.toString();
			if (hostUri.getPort() <= 0) builder.host += ":61616";
		}
		
		EvlContextKafkaMaster context = new EvlContextKafkaMaster(builder.parallelism, builder.distributedParallelism, builder.getJobSplitter(), builder.host, builder.sessionID);
		builder.module = new EvlModuleKafkaMaster(context);
	}
}
