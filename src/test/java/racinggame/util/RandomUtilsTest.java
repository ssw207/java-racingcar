package racinggame.util;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class RandomUtilsTest {

    @Disabled("싪패 가능성이 있는 테스트 이므로 로컬에서 1회성 실행만 할것")
    @Test
    void 랜덤_숫자가_0_9_사이로_생성된다() {
        //given
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 1000; i++) {
            set.add(RandomUtils.randomNumber(10));
        }

        assertThat(set)
                .containsExactly(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
                .doesNotContain(11, 12, 13, 14, 15, 16, 17);
    }

}