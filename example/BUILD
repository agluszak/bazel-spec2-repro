load("@io_bazel_rules_scala//scala:scala.bzl", "scala_specs2_junit_test", "scala_test")

scala_specs2_junit_test(
    name = "example-spec2-test",
    srcs = ["ExampleSpec2Test.scala"],
    suffixes = ["Test"],
    visibility = ["//visibility:public"],
)

scala_test(
    name = "example-test",
    srcs = ["ExampleScalaTest.scala"],
    visibility = ["//visibility:public"],
)
