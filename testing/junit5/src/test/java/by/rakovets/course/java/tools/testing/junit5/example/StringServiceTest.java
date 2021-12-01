package by.rakovets.course.java.tools.testing.junit5.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringServiceTest {
    private static StringService stringService;

    @BeforeAll
    static void init() {
        stringService = new StringServiceImpl();
    }

    @Test
    void trimTest() {
        Assertions.assertEquals("", stringService.trim("  \n\t   "));
        Assertions.assertEquals("1", stringService.trim("     1\t"));
        Assertions.assertEquals("c", stringService.trim("     c\n\n       "));
        Assertions.assertEquals("e", stringService.trim("\n\ne       "));
    }

    @MethodSource("isEmptyArgumentsProvider")
    @ParameterizedTest
    void isEmptyTest(boolean expected, String str) {
        Assertions.assertEquals(expected, stringService.isEmpty(str));
    }

    static Stream<Arguments> isEmptyArgumentsProvider() {
        return Stream.of(
                Arguments.arguments(true, "" ),
                Arguments.arguments(true, null),
                Arguments.arguments(true, "    "),
                Arguments.arguments(true, "\t"),
                Arguments.arguments(true, "\n")
        );
    }

    @Test
    void isPalindromeThrowExceptionTest() {
        Executable executable = () -> stringService.isPalindrome(null);
        Assertions.assertThrows(WrongArgumentException.class, executable);
    }

    @Test
    void isPalindrome() throws WrongArgumentException {
        Assertions.assertTrue(stringService.isPalindrome("121"));
    }
}
