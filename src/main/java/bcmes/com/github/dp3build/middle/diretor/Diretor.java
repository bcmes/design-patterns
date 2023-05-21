package bcmes.com.github.dp3build.middle.diretor;

import bcmes.com.github.dp3build.middle.builder.Builder;

public class Diretor {
    public static Builder makeSUV(Builder builder) {
        return builder.gps(true).seats(6).engine("Evolution");
    }

    public static Builder makeManualSUV(Builder builder) {
        return builder.gps(true).seats(6).engine("Manual-Evolution");
    }
}
