package com.stanfy.spoon.gradle

/**
 * Spoon extension.
 */
class SpoonExtension {

  /** Debug logging flag. */
  boolean debug

  /** Ignore test failures flag. */
  boolean ignoreFailures

  /** Devices to run the tests on (specified with serial numbers). */
  Set<String> devices

}
