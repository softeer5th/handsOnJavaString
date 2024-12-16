package kr.codesquad;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class StringHandsOnTest {


    @Test
    @DisplayName("같은 문자열의 해시코드 비교 ")
    public void compareStringHashCode() {
        String abc1 = "abc";
        String abc2 = new String("abc");
        // TODO 1 동일한 문자열이 생성한 인스턴스를 가리키는 지 비교
        assertFalse(abc1 == abc2);
        assertNotEquals(System.identityHashCode(abc1), System.identityHashCode(abc2));
    }

    @Test
    @DisplayName("문자열 길이 구하기")
    public void test_stringLongLong() throws Exception {
        String name = "박재성";
        // TODO 2 문자열 길이 구하기
//        assertEquals(name.length(), 3);
    }

    @Test
    @DisplayName("문자열 덧붙이기")
    public void assembleStrings() throws Exception {
        String name = "박재성";
        String welcome = "안녕!";
        // TODO 3 문자열 더하기
//        assertEquals(welcome.concat(name), "안녕!박재성");
    }

    @Test
    @DisplayName("string 을 char 단위로 출력")
    public void testPrintStringAsAChar() throws Exception {
        String name = "박재성";
        // TODO 4 string 을 char 단위로 출력
//        for (int i = 0; i < name.length(); i++) {
//            System.out.println(name.toCharArray()[i]);
//        }
    }

    @Test
    @DisplayName("더하기 연산을 이용해 String을 거꾸로 출력하기")
    public void stringReversedWithPlus() throws Exception {
        String name = "박재성";
        String answer = "";
        // TODO 5 더하기 연산을 이용해 String을 거꾸로 출력하기
//        for (int i = 0; i < name.length(); i++) {
//            answer += name.toCharArray()[name.length() - i - 1];
//        }
//
//        assertEquals(answer, "성재박");
    }


    @Test
    @DisplayName("다른 방법으로 문자열을 거꾸로 출력하기")
    public void 문자열_뒤집기() throws Exception {
        String name = "박재성";
        StringBuilder sb = new StringBuilder();

//        for (int i = 0; i < name.length(); i++) {
//            sb.append(name.toCharArray()[name.length() - i - 1]);
//        }

//        assertEquals(sb.toString(), "성재박");
    }

}