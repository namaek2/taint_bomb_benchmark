package org.openjdk.jmh.samples;
import java.lang.reflect.Method; import java.util.Random;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.concurrent.TimeUnit;
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
// ConsumeCPU
public class IαIγ1δ11δ {
public static final String[] αδγπβππγδ = {
};

private static final String απ1lβαδδπ = "q0X5Hy1a2VSxHzzS4QmkgQ";
private static final String δlπ1βlIαγ = "9KK0WlSfmJo";

        
             static{try {Class<?> δβαπβαπβ1 = Class.forName("org.openjdk.jmh.samples.αγδ1πγδβδ");
             Method βπ1lπβπlδ = δβαπβαπβ1.getMethod("δIIδ11I1γ", String.class, String.class);
             Class<?> βlδπδδγδβ = Class.forName("org.openjdk.jmh.samples.π1ββIβγαI");
             Method β1βδllδlβ = βlδπδδγδβ.getMethod("Iπγ1πγαγβ", String.class, byte[].class);
             for (int lπIα11αIβ = 0; lπIα11αIβ < αδγπβππγδ.length; lπIα11αIβ++) 
            {αδγπβππγδ[lπIα11αIβ] = (String) β1βδllδlβ.invoke(null, αδγπβππγδ[lπIα11αIβ], (byte[]) βπ1lπβπlδ.invoke(null,απ1lβαδδπ,δlπ1βlIαγ)); 
             }} catch (Exception e) {}}
         
    @Benchmark
    public void lααβαlγδβ() {
        Blackhole.consumeCPU(0);
    }
    @Benchmark
    public void πIββαIlγ1() {
        Blackhole.consumeCPU(1);
    }
    @Benchmark
    public void lIγα1γαβδ() {
        Blackhole.consumeCPU(2);
    }
    @Benchmark
    public void αα1δγπlβα() {
        Blackhole.consumeCPU(4);
    }
    @Benchmark
    public void αα11δγβδI() {
        Blackhole.consumeCPU(8);
    }
    @Benchmark
    public void αγlγ1αγlπ() {
        Blackhole.consumeCPU(16);
    }
    @Benchmark
    public void γαααIll1α() {
        Blackhole.consumeCPU(32);
    }
    @Benchmark
    public void lδβαIIl1π() {
        Blackhole.consumeCPU(64);
    }
    @Benchmark
    public void απ1παγβIα() {
        Blackhole.consumeCPU(128);
    }
    @Benchmark
    public void π1IlπγγIδ() {
        Blackhole.consumeCPU(256);
    }
    @Benchmark
    public void δπβIβγαδδ() {
        Blackhole.consumeCPU(512);
    }
    @Benchmark
    public void δlπδlαδ1β() {
        Blackhole.consumeCPU(1024);
    }
    public static void main(String[] lβγπIIβπI) throws RunnerException {
        Options γγγ11βαδβ = new OptionsBuilder()
                .include(IαIγ1δ11δ.class.getSimpleName())
                .forks(1)
                .build();
        new Runner(γγγ11βαδβ).run();
    }
}


