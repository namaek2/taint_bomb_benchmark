package org.sample.obfuscated.jobf;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OperationsPerInvocation;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Benchmark)
@Fork(5)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode({Mode.AverageTime})
/* loaded from: aa.zip:org/sample/JMHSample_37_CacheAccess.class */
public class JMHSample_37_CacheAccess {
    private /* synthetic */ int[][] matrix;
    private static final /* synthetic */ String[] llIIl = null;
    private static final /* synthetic */ int[] IlIIll = null;
    private static final /* synthetic */ int COUNT;
    private static final /* synthetic */ int MATRIX_SIZE;

    private static void llIIlIl() {
        IlIIll = new int[6];
        IlIIll[0] = (-((-4129) & 24293)) & (-8481) & 32740;
        IlIIll[1] = ((59 ^ 8) ^ (69 ^ 34)) & (((20 ^ 116) ^ (84 ^ 96)) ^ (-" ".length()));
        IlIIll[2] = " ".length();
        IlIIll[3] = (-17843) & 16795058;
        IlIIll[4] = "  ".length();
        IlIIll[5] = 200 ^ 192;
    }

    private static String Il(String IlllIlIlIllllll, String llllIlIlIllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIlIlIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(IlIIll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(IlllIlIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIllIlIllllll) {
            lIIIllIlIllllll.printStackTrace();
            return null;
        }
    }

    @Benchmark
    @OperationsPerInvocation(16777216)
    public void colFirst(Blackhole IIllIIllIllllll) {
        int IlllIIllIllllll = IlIIll[1];
        while (IIlIlIl(IlllIIllIllllll, IlIIll[0])) {
            int llllIIllIllllll = IlIIll[1];
            while (IIlIlIl(llllIIllIllllll, IlIIll[0])) {
                IIllIIllIllllll.consume(this.matrix[llllIIllIllllll][IlllIIllIllllll]);
                llllIIllIllllll++;
                "".length();
                if (" ".length() == (((143 ^ 134) ^ (175 ^ 186)) & (((38 ^ 46) ^ (102 ^ 114)) ^ (-" ".length())))) {
                    return;
                }
            }
            IlllIIllIllllll++;
            "".length();
            if ((-" ".length()) == (((60 ^ 78) ^ (6 ^ 105)) & (("  ".length() ^ (127 ^ 96)) ^ (-" ".length())))) {
                return;
            }
        }
    }

    private static boolean IIlIlIl(int i, int i2) {
        return i < i2;
    }

    @Setup
    public void setup() {
        this.matrix = new int[IlIIll[0]][IlIIll[0]];
        Random random = new Random(1234L);
        int IlIllIllIllllll = IlIIll[1];
        while (IIlIlIl(IlIllIllIllllll, IlIIll[0])) {
            int llIllIllIllllll = IlIIll[1];
            while (IIlIlIl(llIllIllIllllll, IlIIll[0])) {
                this.matrix[IlIllIllIllllll][llIllIllIllllll] = random.nextInt();
                llIllIllIllllll++;
                "".length();
                if (" ".length() <= (((((142 + 39) - 111) + 119) ^ (((40 + 31) - (-23)) + 45)) & (((66 ^ 18) ^ (77 ^ 43)) ^ (-" ".length())))) {
                    return;
                }
            }
            IlIllIllIllllll++;
            "".length();
            if ((-" ".length()) >= (189 ^ 185)) {
                return;
            }
        }
    }

    private static String lIllIIl(String llIIIlIlIllllll, String IlIIIlIlIllllll) {
        try {
            SecretKeySpec IllIIlIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIIIlIlIllllll.getBytes(StandardCharsets.UTF_8)), IlIIll[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(IlIIll[4], IllIIlIlIllllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIlIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception IIlIIlIlIllllll) {
            IIlIIlIlIllllll.printStackTrace();
            return null;
        }
    }

    private static void llllIIl() {
        llIIl = new String[IlIIll[4]];
        llIIl[IlIIll[1]] = Il("aZg/u5UgoCU=", "ckLny");
        llIIl[IlIIll[2]] = lIllIIl("4385UPB9ctE=", "vbFte");
    }

    public static void main(String[] IlIlllIlIllllll) throws RunnerException {
        Options lIIlllIlIllllll = new OptionsBuilder().include(String.valueOf(new StringBuilder().append(llIIl[IlIIll[1]]).append(JMHSample_37_CacheAccess.class.getSimpleName()).append(llIIl[IlIIll[2]]))).build();
        new Runner(lIIlllIlIllllll).run();
        "".length();
    }

    static {
        llIIlIl();
        llllIIl();
        MATRIX_SIZE = IlIIll[3];
        COUNT = IlIIll[0];
    }

    @Benchmark
    @OperationsPerInvocation(16777216)
    public void rowFirst(Blackhole IIIIIIllIllllll) {
        int IlIIIIllIllllll = IlIIll[1];
        while (IIlIlIl(IlIIIIllIllllll, IlIIll[0])) {
            int llIIIIllIllllll = IlIIll[1];
            while (IIlIlIl(llIIIIllIllllll, IlIIll[0])) {
                IIIIIIllIllllll.consume(this.matrix[IlIIIIllIllllll][llIIIIllIllllll]);
                llIIIIllIllllll++;
                "".length();
                if (0 != 0) {
                    return;
                }
            }
            IlIIIIllIllllll++;
            "".length();
            if ("  ".length() <= (-" ".length())) {
                return;
            }
        }
    }
}
