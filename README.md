# OpenStack Starter Project for Scala 2.10 #

I used the Java bindings for OpenStack to create a Scala project that could serve as the basis for experimentation.
The Scala REPL is a run-time interpreter, which allows you to type in statements and have them execute.
When you bring up the Scala REPL for this project, all of the OpenStack APIs are available for experimentation.

You can play with the project code base, or just the OpenStack libraries by using the Scala REPL like this:

<pre>
$ <b>sbt console</b>
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
import java.io._
Welcome to Scala version 2.10.2 (Java HotSpot(TM) 64-Bit Server VM, Java 1.7.0_25).
Type in expressions to have them evaluated.
Type :help for more information.

scala> <b>// Type in Scala code here and have it evaluated</b>
</pre>

This project also contains the OpenStack Examples. Run them like this:

<pre>
$ <b>sbt run</b>
[info] Loading global plugins from /home/mslinn/.sbt/plugins
[info] Updating {file:/home/mslinn/.sbt/plugins/}default-3a91be...
[info] Resolving org.scala-sbt#precompiled-2_10_1;0.12.3 ...
[info] Done updating.
[info] Loading project definition from /home/mslinn/work/experiments/OpenstackScala/project
[info] Set current project to OpenStack Playpen for Scala (in build file:/home/mslinn/work/experiments/OpenstackScala/)
[info] Compiling 1 Scala source to /home/mslinn/work/experiments/OpenstackScala/target/scala-2.10/classes...

Multiple main classes detected, select one to run:

 [1] ExamplesConfiguration
 [2] GlanceListImages
 [3] KeystoneAuthentication
 [4] KeystoneCreateTenant
 [5] KeystoneCreateUser
 [6] NovaCreateServer
 [7] NovaListFlavors
 [8] NovaListImages
 [9] NovaListServers
 [10] QuantumListNetworks
 [11] QuantumQueryNetworks
 [12] SwiftExample
 [13] TestAll

Enter number:</pre>

Note that the Openstack examples have the following hard-coded configuration in `ExamplesConfiguration`:

<pre>public static final String KEYSTONE_AUTH_URL = "http://identity/v2.0";
public static final String KEYSTONE_USERNAME = "";
public static final String KEYSTONE_PASSWORD = "";
public static final String KEYSTONE_ENDPOINT = "http://keystone/v2.0";
public static final String TENANT_NAME = "admin";
public static final String NOVA_ENDPOINT = "http://compute/v2";</pre>

You might want to make an entry in `/etc/hosts` or a DNS entry for `keystone` and `compute` that points to instances of those services so the example run.
If you do not, you will get a `NullPointException` when the examples are run.
