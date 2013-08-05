/**
 * Because the Openstack examples are in a jar, `sbt run` and `sbt run-main` do not work on the main methods in the jar,
 * so the following convenience apps are provided to run them.
 */

/** Run com.woorea.openstack.examples.ExamplesConfiguration.main() */
object ExamplesConfiguration extends App {
  com.woorea.openstack.examples.ExamplesConfiguration.main(args)
}

/** Run com.woorea.openstack.examples.glance.GlanceListImages.main() */
object GlanceListImages extends App {
  com.woorea.openstack.examples.glance.GlanceListImages.main(args)
}

/** Run com.woorea.openstack.examples.hpcloud.KeystoneAuthentication.main() */
object KeystoneAuthentication extends App {
  com.woorea.openstack.examples.hpcloud.KeystoneAuthentication.main(args)
}

/** Run com.woorea.openstack.examples.keystone.KeystoneCreateTenant.main() */
object KeystoneCreateTenant extends App {
  com.woorea.openstack.examples.keystone.KeystoneCreateTenant.main(args)
}

/** Run com.woorea.openstack.examples.keystone.KeystoneCreateUser.main() */
object KeystoneCreateUser extends App {
  com.woorea.openstack.examples.keystone.KeystoneCreateUser.main(args)
}

/** Run com.woorea.openstack.examples.compute.NovaCreateServer.main() */
object NovaCreateServer extends App {
  com.woorea.openstack.examples.compute.NovaCreateServer.main(args)
}

/** Run com.woorea.openstack.examples.compute.NovaListFlavors.main() */
object NovaListFlavors extends App {
  com.woorea.openstack.examples.compute.NovaListFlavors.main(args)
}

/** Run com.woorea.openstack.examples.compute.NovaListImages.main() */
object NovaListImages extends App {
  com.woorea.openstack.examples.compute.NovaListImages.main(args)
}

/** Run com.woorea.openstack.examples.compute.NovaListServers.main() */
object NovaListServers extends App {
  com.woorea.openstack.examples.compute.NovaListServers.main(args)
}

/** Run com.woorea.openstack.examples.network.QuantumListNetworks.main() */
object QuantumListNetworks extends App {
  com.woorea.openstack.examples.network.QuantumListNetworks.main(args)
}

/** Run com.woorea.openstack.examples.network.QuantumQueryNetworks.main() */
object QuantumQueryNetworks extends App {
  com.woorea.openstack.examples.network.QuantumQueryNetworks.main(args)
}

/** Run com.woorea.openstack.examples.objectstore.SwiftExample.main() */
object SwiftExample extends App {
  com.woorea.openstack.examples.objectstore.SwiftExample.main(args)
}

/** Run com.woorea.openstack.examples.metering.v2.TestAll.main()
  * This example has a misleading name; it does not test everything.
  * Instead, it is just an incomplete `Ceilometer` test. */
object TestAll extends App {
  com.woorea.openstack.examples.metering.v2.TestAll.main(args)
}
