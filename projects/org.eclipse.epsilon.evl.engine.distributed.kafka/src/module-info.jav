module org.eclipse.epsilon.evl.engine.distributed.kafka {
	exports org.eclipse.epsilon.evl.distributed.kafka.launch;
	exports org.eclipse.epsilon.evl.distributed.kafka;
	exports org.eclipse.epsilon.evl.distributed.kafka.atomic;
	exports org.eclipse.epsilon.evl.distributed.kafka.batch;
	requires transitive org.eclipse.epsilon.evl.engine.distributed;
}