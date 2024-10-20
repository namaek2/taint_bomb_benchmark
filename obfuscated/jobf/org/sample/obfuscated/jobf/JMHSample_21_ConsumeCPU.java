package org.sample.obfuscated.jobf;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode({Mode.AverageTime})
/* loaded from: aa.zip:org/sample/JMHSample_21_ConsumeCPU.class */
public class JMHSample_21_ConsumeCPU {
    private static final /* synthetic */ int[] IIIll = null;

    @Benchmark
    public void consume_0064() {
        Blackhole.consumeCPU(64L);
    }

    @Benchmark
    public void consume_0032() {
        Blackhole.consumeCPU(32L);
    }

    @Benchmark
    public void consume_0016() {
        Blackhole.consumeCPU(16L);
    }

    @Benchmark
    public void consume_0008() {
        Blackhole.consumeCPU(8L);
    }

    public static void main(String[] IlIllIlllllllll) throws RunnerException {
        Options IIIllIlllllllll = new OptionsBuilder().include(JMHSample_21_ConsumeCPU.class.getSimpleName()).forks(IIIll[0]).build();
        new Runner(IIIllIlllllllll).run();
        "".length();
    }

    @Benchmark
    public void consume_0002() {
        Blackhole.consumeCPU(2L);
    }

    static {
        IIl();
    }

    private static void IIl() {
        IIIll = new int[1];
        IIIll[0] = " ".length();
    }

    @Benchmark
    public void consume_0004() {
        Blackhole.consumeCPU(4L);
    }

    @Benchmark
    public void consume_0000() {
        Blackhole.consumeCPU(0L);
    }

    @Benchmark
    public void consume_0256() {
        Blackhole.consumeCPU(256L);
    }

    @Benchmark
    public void consume_0001() {
        Blackhole.consumeCPU(1L);
    }

    @Benchmark
    public void consume_1024() {
        Blackhole.consumeCPU(1024L);
    }

    @Benchmark
    public void consume_0128() {
        Blackhole.consumeCPU(128L);
    }

    @Benchmark
    public void consume_0512() {
        Blackhole.consumeCPU(512L);
    }
}
