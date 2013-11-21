package com.stanfy.spoon.gradle

/**
 * Spoon extension.
 */
class SpoonExtension {

  /** Debug logging flag. */
  boolean debug

  /** Fail if no device is connected flag. */
  boolean failIfNoDeviceConnected

  /** Ignore test failures flag. */
  boolean ignoreFailures

  /** Fully qualified name of the test class to be run (e.g. com.example.foo.test.MyTestCase). */
  String className

  /** Test method to be run. Used when `className` is provided. */
  String methodName

  /** If set, will run only tests annotated with size marker (@SmallTest, @MediumTest, @LargeTest).
      Must be one of: "small", "medium", "large". */ 
  String testSize
}
