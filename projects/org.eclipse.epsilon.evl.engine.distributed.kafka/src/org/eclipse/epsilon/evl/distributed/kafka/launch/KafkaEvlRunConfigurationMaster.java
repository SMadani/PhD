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

import org.eclipse.epsilon.evl.distributed.kafka.EvlModuleKafkaMaster;
import org.eclipse.epsilon.evl.distributed.kafka.execute.context.EvlContextKafkaMaster;
import org.eclipse.epsilon.evl.distributed.launch.DistributedEvlRunConfiguration;
import org.eclipse.epsilon.evl.distributed.launch.DistributedEvlRunConfigurationMaster;

/**
 * 
 *
 * @author Sina Madani
 * @since 1.6
 */
public class KafkaEvlRunConfigurationMaster extends DistributedEvlRunConfigurationMaster {
	
	protected final boolean localStandalone;
	
	@SuppressWarnings("unchecked")
	public static class Builder<R extends KafkaEvlRunConfigurationMaster, B extends Builder<R, B>> extends DistributedEvlRunConfigurationMaster.Builder<R, B> {
		@Override
		protected EvlModuleKafkaMaster createModule() {
			EvlContextKafkaMaster context = new EvlContextKafkaMaster(parallelism, distributedParallelism, getJobSplitter(), host, sessionID);
			return new EvlModuleKafkaMaster(context);
		}
		
		public boolean localStandalone;
		
		public B withLocalStandalone() {
			localStandalone = true;
			return (B) this;
		}
		
		protected Builder() {
			super();
		}
		protected Builder(Class<R> runConfigClass) {
			super(runConfigClass);
		}
	}

	public KafkaEvlRunConfigurationMaster(Builder<? extends DistributedEvlRunConfiguration, ?> builder) {
		super(builder);
		this.localStandalone = builder.localStandalone;
		//getModule().setLogger(this::writeOut);
	}
	
	@Override
	public EvlModuleKafkaMaster getModule() {
		return (EvlModuleKafkaMaster) super.getModule();
	}
}
