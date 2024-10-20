package org.sample.obfuscated.jobf;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Benchmark)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(5)
@BenchmarkMode({Mode.AverageTime})
/* loaded from: aa.zip:org/sample/JMHSample_39_MemoryAccess.class */
public class JMHSample_39_MemoryAccess {
    private static final /* synthetic */ int[] lIllIl = null;
    private static final /* synthetic */ String[] IllIIl = null;
    public static final /* synthetic */ int N;
    private /* synthetic */ int[] intArray = new int[lIllIl[0]];
    private /* synthetic */ List<Integer> intList = new ArrayList(lIllIl[0]);
    private /* synthetic */ List<Integer> shuffledIntList = new ArrayList(lIllIl[0]);

    @Benchmark
    public long sumArray() {
        long IllIIIlIlllllll = 0;
        int IIIlIIlIlllllll = lIllIl[1];
        while (lIIIIIl(IIIlIIlIlllllll, lIllIl[0])) {
            IllIIIlIlllllll += this.intArray[IIIlIIlIlllllll];
            IIIlIIlIlllllll++;
            "".length();
            if (0 != 0) {
                return 0L;
            }
        }
        return IllIIIlIlllllll;
    }

    private static boolean lIIIIIl(int i, int i2) {
        return i < i2;
    }

    static {
        IIIIIIl();
        llllll();
        N = lIllIl[0];
    }

    private static void IIIIIIl() {
        lIllIl = new int[4];
        lIllIl[0] = (-((-5698) & 22253)) & (-4629) & 20021183;
        lIllIl[1] = (122 ^ 54) & ((235 ^ 167) ^ (-1));
        lIllIl[2] = " ".length();
        lIllIl[3] = "  ".length();
    }

    public static void main(String[] llllIlIIlllllll) throws RunnerException {
        new Runner(new OptionsBuilder().include(String.valueOf(new StringBuilder().append(IllIIl[lIllIl[1]]).append(JMHSample_39_MemoryAccess.class.getSimpleName()).append(IllIIl[lIllIl[2]]))).build()).run();
        "".length();
    }

    @Benchmark
    public long sumArrayListShuffled() {
        long IIlIllIIlllllll = 0;
        int IllIllIIlllllll = lIllIl[1];
        while (lIIIIIl(IllIllIIlllllll, lIllIl[0])) {
            IIlIllIIlllllll += this.shuffledIntList.get(IllIllIIlllllll).intValue();
            IllIllIIlllllll++;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return 0L;
            }
        }
        return IIlIllIIlllllll;
    }

    @Setup
    public void setup() {
        Random llllIIlIlllllll = new Random(1234L);
        int lIIIlIlIlllllll = lIllIl[1];
        while (lIIIIIl(lIIIlIlIlllllll, lIllIl[0])) {
            this.intArray[lIIIlIlIlllllll] = llllIIlIlllllll.nextInt();
            this.intList.add(Integer.valueOf(this.intArray[lIIIlIlIlllllll]));
            "".length();
            this.shuffledIntList.add(Integer.valueOf(this.intArray[lIIIlIlIlllllll]));
            "".length();
            lIIIlIlIlllllll++;
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        Collections.shuffle(this.shuffledIntList);
    }

    @Benchmark
    public long sumArrayList() {
        long lIllllIIlllllll = 0;
        int llllllIIlllllll = lIllIl[1];
        while (lIIIIIl(llllllIIlllllll, lIllIl[0])) {
            lIllllIIlllllll += this.intList.get(llllllIIlllllll).intValue();
            llllllIIlllllll++;
            "".length();
            if ("  ".length() > "   ".length()) {
                return 0L;
            }
        }
        return lIllllIIlllllll;
    }

    private static void llllll() {
        IllIIl = new String[lIllIl[3]];
        IllIIl[lIllIl[1]] = IlIIIl("0PckBP5DhyU=", "JrQXZ");
        IllIIl[lIllIl[2]] = IlIIIl("lsmmoyIqQh4=", "WUqJB");
    }

    private static String IlIIIl(String lIlIIlIIlllllll, String IIlIIlIIlllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIlIIlIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIlIIlllllll = Cipher.getInstance("Blowfish");
            lllIIlIIlllllll.init(lIllIl[3], secretKeySpec);
            return new String(lllIIlIIlllllll.doFinal(Base64.getDecoder().decode(lIlIIlIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception IllIIlIIlllllll) {
            IllIIlIIlllllll.printStackTrace();
            return null;
        }
    }
}
