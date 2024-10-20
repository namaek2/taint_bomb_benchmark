package org.sample.obfuscated.jobf;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OperationsPerInvocation;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode({Mode.AverageTime})
@State(Scope.Thread)
/* loaded from: aa.zip:org/sample/JMHSample_11_Loops.class */
public class JMHSample_11_Loops {
    private static final/* synthetic */ int[] llIll = null;
    /* synthetic */ int x = llIll[0];
    /* synthetic */ int y = llIll[1];

    @Benchmark
    @OperationsPerInvocation(10)
    public int measureWrong_10() {
        return reps(llIll[3]);
    }

    @Benchmark
    @OperationsPerInvocation(1000)
    public int measureWrong_1000() {
        return reps(llIll[5]);
    }

    @Benchmark
    @OperationsPerInvocation(10000)
    public int measureWrong_10000() {
        return reps(llIll[6]);
    }

    @Benchmark
    @OperationsPerInvocation(1)
    public int measureWrong_1() {
        return reps(llIll[0]);
    }

    static {
        lIll();
    }

    private static boolean Illl(int i, int i2) {
        return i < i2;
    }

    @Benchmark
    @OperationsPerInvocation(100)
    public int measureWrong_100() {
        return reps(llIll[4]);
    }

    private static void lIll() {
        llIll = new int[8];
        llIll[0] = " ".length();
        llIll[1] = "  ".length();
        llIll[2] = (185 ^ 154) & ((71 ^ 100) ^ (-1));
        llIll[3] = (((112 + 106) - 145) + 92) ^ (((41 + 167) - 131) + 98);
        llIll[4] = (205 ^ 164) ^ (163 ^ 174);
        llIll[5] = (-((-19521) & 27720)) & (-20497) & 29695;
        llIll[6] = (-4271) & 14270;
        llIll[7] = (-((-20931) & 29134)) & (-18453) & 126655;
    }

    public static void main(String[] llIIIlIllllllll) throws RunnerException {
        new Runner(new OptionsBuilder().include(JMHSample_11_Loops.class.getSimpleName()).forks(llIll[0]).build()).run();
        "".length();
    }

    private int reps(int llllllIllllllll) {
        int IlllllIllllllll = llIll[2];
        int lIIIIIlllllllll = llIll[2];
        while (Illl(lIIIIIlllllllll, llllllIllllllll)) {
            IlllllIllllllll += this.x + this.y;
            lIIIIIlllllllll++;
            "".length();
            if (0 != 0) {
                return (72 ^ 2) & ((49 ^ 123) ^ (-1));
            }
        }
        return IlllllIllllllll;
    }

    @Benchmark
    @OperationsPerInvocation(100000)
    public int measureWrong_100000() {
        return reps(llIll[7]);
    }

    @Benchmark
    public int measureRight() {
        return this.x + this.y;
    }
}
