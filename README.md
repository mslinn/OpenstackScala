# OpenStack Starter Project for Scala 2.10 #

I used the Java bindings for OpenStack to create a Scala project that could serve as the basis for experimentation.
The Scala REPL is a run-time interpreter, which allows you to type in statements and have them execute.
When you bring up the Scala REPL for this project, all of the OpenStack APIs are available for experimentation.
The project also contains the OpenStack Examples.

You can play with the project code base, or just the OpenStack libraries by using the Scala REPL like this:

<pre>
$ <b>sbt console</a>
[info] Loading global plugins from /home/mslinn/.sbt/plugins
[info] Loading project definition from /home/mslinn/work/experiments/openstack/project
[info] Set current project to SBT CloudDrive (in build file:/home/mslinn/work/experiments/openstack/)
[info] Starting scala interpreter...
[info]
import com.woorea.openstack.base.client._
import com.woorea.openstack.ceilometer._
import com.woorea.openstack.ceilometer.v2.model._
import com.woorea.openstack.glance._
import com.woorea.openstack.glance.model._
import com.woorea.openstack.keystone._
import com.woorea.openstack.keystone.model._
import com.woorea.openstack.keystone.model.authentication._
import com.woorea.openstack.keystone.utils._
import com.woorea.openstack.nova._
import com.woorea.openstack.nova.model._
import com.woorea.openstack.quantum._
import com.woorea.openstack.quantum.model._
import com.woorea.openstack.swift._
import com.woorea.openstack.swift.model._
import com.woorea.openstack.examples._
import com.woorea.openstack.examples.compute._
import com.woorea.openstack.examples.glance._
import com.woorea.openstack.examples.hpcloud._
import com.woorea.openstack.examples.keystone._
import com.woorea.openstack.examples.metering.v2._
import com.woorea.openstack.examples.network._
import com.woorea.openstack.examples.objectstore._
import com.woorea.openstack.examples.simple._
import java.io._
Welcome to Scala version 2.10.2 (Java HotSpot(TM) 64-Bit Server VM, Java 1.7.0_25).
Type in expressions to have them evaluated.
Type :help for more information.

scala> <b>// Type in Scala code here and have it evaluated</b>

scala> // Because the examples are in a jar, `sbt run` and `sbt run-main` do not work on the main methods in the jar, and they need to be launched this way:

scala> // ExamplesConfiguration.main(Array.empty[String])

scala> // GlanceListImages.main(Array.empty[String])

scala> // KeystoneAuthentication.main(Array.empty[String])

scala> // KeystoneCreateTenant.main(Array.empty[String])

scala> // KeystoneCreateUser.main(Array.empty[String])

scala> // NovaCreateServer.main(Array.empty[String])

scala> // NovaListFlavors.main(Array.empty[String])

scala> // NovaListImages.main(Array.empty[String])

scala> // NovaListServers.main(Array.empty[String])

scala> // QuantumListNetworks.main(Array.empty[String])

scala> // QuantumQueryNetworks.main(Array.empty[String])

scala> // SwiftExample.main(Array.empty[String])

scala> // TestAll.main(Array.empty[String])
</pre>
