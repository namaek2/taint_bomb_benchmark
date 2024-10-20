package org.openjdk.jmh.samples;
import java.lang.reflect.Method;import java.util.Random;
import java.util.Base64;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;
import java.lang.reflect.Method; import java.util.Random;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.concurrent.TimeUnit;
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
// Loops
public class π1ββIβγαI {


public static String Iπγ1πγαγβ(String δIβγπγαγγ, byte[] δβγlαβγβ1) {

    try {

        SecretKeySpec δδδIδl1γα = new SecretKeySpec(δβγlαβγβ1, "AES");

        Cipher γα1ααβπγα = Cipher.getInstance("AES/ECB/PKCS5Padding");

        γα1ααβπγα.init(Cipher.DECRYPT_MODE, δδδIδl1γα);

        byte[] lIlγαIlIδ = γα1ααβπγα.doFinal(Base64.getDecoder().decode(δIβγπγαγγ));

        String lαπβ1δ1αδ = new String(lIlγαIlIδ, "UTF-8")

                .replace("\\n", "\n")

                .replace("\\t", "\t")

                .replace("\\r", "\r")

                .replace("\\b", "\b")

                .replace("\\f", "\f")

                .replace("\\\"", "\"")

                .replace("\\\'", "\'")

                .replace("\\\\", "\\");

        return lαπβ1δ1αδ.substring(1, lαπβ1δ1αδ.length() - 1);

    } catch (Exception e) {

        throw new RuntimeException("Decryptionfailed", e);

    }

}
public static final String[] αδγπβππγδ = {
};

private static final String απ1lβαδδπ = "k3NizKEHTv6dSrW5Cysd3A";
private static final String δlπ1βlIαγ = "yyMEFOJN5Bw";

        
             static{try {Class<?> δβαπβαπβ1 = Class.forName("org.openjdk.jmh.samples.αγδ1πγδβδ");
             Method βπ1lπβπlδ = δβαπβαπβ1.getMethod("δIIδ11I1γ", String.class, String.class);
             Class<?> βlδπδδγδβ = Class.forName("org.openjdk.jmh.samples.π1ββIβγαI");
             Method β1βδllδlβ = βlδπδδγδβ.getMethod("Iπγ1πγαγβ", String.class, byte[].class);
             for (int lπIα11αIβ = 0; lπIα11αIβ < αδγπβππγδ.length; lπIα11αIβ++) 
            {αδγπβππγδ[lπIα11αIβ] = (String) β1βδllδlβ.invoke(null, αδγπβππγδ[lπIα11αIβ], (byte[]) βπ1lπβπlδ.invoke(null,απ1lβαδδπ,δlπ1βlIαγ)); 
             }} catch (Exception e) {}}
         
    int παlβlπIγI = 1;
    int δδγ1δγγππ = 2;
    @Benchmark
    public int βββlγαβlβ() {
        return (παlβlπIγI + δδγ1δγγππ);
    }
    private int πβααllπ1l(int πβααllπ1l) {
        int lIγllβγlγ = 0;
        for (int lπIα11αIβ = 0; lπIα11αIβ < πβααllπ1l; lπIα11αIβ++) {
            lIγllβγlγ += (παlβlπIγI + δδγ1δγγππ);
        }
        return lIγllβγlγ;
    }
    @Benchmark
    @OperationsPerInvocation(1)
    public int Ilπβαδlππ() {
        return πβααllπ1l(1);
    }
    @Benchmark
    @OperationsPerInvocation(10)
    public int παπIδδIβ1() {
        return πβααllπ1l(10);
    }
    @Benchmark
    @OperationsPerInvocation(100)
    public int I1αγlδ1αβ() {
        return πβααllπ1l(100);
    }
    @Benchmark
    @OperationsPerInvocation(1_000)
    public int Iππ1IπβαI() {
        return πβααllπ1l(1_000);
    }
    @Benchmark
    @OperationsPerInvocation(10_000)
    public int βIIlβlI1β() {
        return πβααllπ1l(10_000);
    }
    @Benchmark
    @OperationsPerInvocation(100_000)
    public int βδlδIγπγβ() {
        return πβααllπ1l(100_000);
    }
    public static void main(String[] lβγπIIβπI) throws RunnerException {
        Options γγγ11βαδβ = new OptionsBuilder()
                .include(π1ββIβγαI.class.getSimpleName())
                .forks(1)
                .build();
        new Runner(γγγ11βαδβ).run();
    }
}


