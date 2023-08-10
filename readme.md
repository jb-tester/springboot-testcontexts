# 
[idea-322088](https://youtrack.jetbrains.com/issue/idea-322088)

Spring: if for some component class another bean is defined in the test configuration, the component from main config is not found

The problem occurs in case when some class is annotated with `@Component` and scanned in the main configuration (in `src` root)
and at the same time the `@Bean`-annotated method of the same class type is defined in the test configuration class(es) (in `test` root). 
Beans should also have the same names.
In this case the src component is not detected by IDEA, only the test bean(s) are considered. As a result, the autowiring error is shown in `src` context, 
since the only found autowiring candidates are from tests, and are not available in the main context.

If the class is not annotated with `@Component`, and is defined as bean using the same-named `@Bean`-annotated methods both in src and test contexts, 
no such problems occur.

If the same class is added to the src context both as component and as bean, IDEA doesn't detect any errors (false-negative), see [IDEA-322109](https://youtrack.jetbrains.com/issue/IDEA-322109).

Also:

[IDEA-322113](https://youtrack.jetbrains.com/issue/IDEA-322113) 

Spring Testing: the test class that is annotated with @ExtendWith(SpringExtension.class) is not detected as valid bean.
See WithInternalImplicitConfigTest.java
