package example

import org.specs2.Specification

/** This specification shows that it is possible to use the example code directly in the specification
  */
class ExampleSpec2Test extends Specification {
  def is = s2"""

  This is a specification to check the 'Hello world' string

  The 'Hello world' string satisfies the following properties:

   ${"Hello world" must haveSize(11)}
   ${"Hello world" must startWith("Hello")}
   ${"Hello world" must endWith("world")}

                                                                  """

}
