name := "OpenStack Playpen for Scala"

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
                     |import com.woorea.openstack.base.client._
                     |import com.woorea.openstack.ceilometer._
                     |import com.woorea.openstack.ceilometer.v2.model._
                     |import com.woorea.openstack.glance._
                     |import com.woorea.openstack.glance.model._
                     |import com.woorea.openstack.keystone._
                     |import com.woorea.openstack.keystone.model._
                     |import com.woorea.openstack.keystone.model.authentication._
                     |import com.woorea.openstack.keystone.utils._
                     |import com.woorea.openstack.nova._
                     |import com.woorea.openstack.nova.model._
                     |import com.woorea.openstack.quantum._
                     |import com.woorea.openstack.quantum.model._
                     |import com.woorea.openstack.swift._
                     |import com.woorea.openstack.swift.model._
                     |import java.io._
                     |""".stripMargin
