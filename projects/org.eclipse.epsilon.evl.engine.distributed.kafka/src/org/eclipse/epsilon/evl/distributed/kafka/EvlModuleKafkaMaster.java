package org.eclipse.epsilon.evl.distributed.kafka;

import java.io.Serializable;
import java.util.Collection;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.evl.distributed.EvlModuleDistributedMaster;
import org.eclipse.epsilon.evl.distributed.execute.context.EvlContextDistributedMaster;

public class EvlModuleKafkaMaster extends EvlModuleDistributedMaster {

	public EvlModuleKafkaMaster(EvlContextDistributedMaster context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepareWorkers(Serializable configuration) throws Exception {
	}

	@Override
	protected void executeWorkerJobs(Collection<? extends Serializable> jobs) throws EolRuntimeException {
	}

}
