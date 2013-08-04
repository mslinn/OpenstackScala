name := "SBT CloudDrive"

version := "0.1"

organization := "micronauticsresearch.com"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "com.woorea" %  "ceilometer-client"  % "3.2.1" withSources(),
  "com.woorea" %  "glance-client"      % "3.2.1" withSources(),
  "com.woorea" %  "keystone-client"    % "3.2.1" withSources(),
  "com.woorea" %  "nova-client"        % "3.2.1" withSources(),
  "com.woorea" %  "quantum-client"     % "3.2.1" withSources(),
  "com.woorea" %  "swift-client"       % "3.2.1" withSources(),
  "com.woorea" %  "openstack-examples" % "3.2.1" withSources() // brings in all of the above
)

initialCommands := """
                     |import com.woorea.openstack.examples._
                     |import com.woorea.openstack.examples.compute._
                     |import com.woorea.openstack.examples.glance._
                     |import com.woorea.openstack.examples.hpcloud._
                     |import com.woorea.openstack.examples.keystone._
                     |import com.woorea.openstack.examples.metering.v2._
                     |import com.woorea.openstack.examples.network._
                     |import com.woorea.openstack.examples.objectstore._
                     |import com.woorea.openstack.examples.simple._
                     |""".stripMargin
