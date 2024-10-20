package org.sample.obfuscated.jobf;

import java.util.concurrent.atomic.AtomicBoolean;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Group;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Control;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@State(Scope.Group)
/* loaded from: aa.zip:org/sample/JMHSample_18_Control.class */
public class JMHSample_18_Control {
    private static final /* synthetic */ int[] lllIl = null;
    public final /* synthetic */ AtomicBoolean flag = new AtomicBoolean();

    public static void main(String[] IIIIlIlllllllll) throws RunnerException {
        Options llllIIlllllllll = new OptionsBuilder().include(JMHSample_18_Control.class.getSimpleName()).threads(lllIl[2]).forks(lllIl[1]).build();
        new Runner(llllIIlllllllll).run();
        "".length();
    }

    static {
        lIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    @Group("pingpong")
    @Benchmark
    public void ping(Control control) {
        while (lIIl(control.stopMeasurement ? 1 : 0) && lIIl(this.flag.compareAndSet(lllIl[0], lllIl[1]) ? 1 : 0)) {
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    @Benchmark
    @Group("pingpong")
    public void pong(Control control) {
        while (lIIl(control.stopMeasurement ? 1 : 0) && lIIl(this.flag.compareAndSet(lllIl[1], lllIl[0]) ? 1 : 0)) {
            "".length();
            if ((-"   ".length()) >= 0) {
                return;
            }
        }
    }

    private static void lIl() {
        lllIl = new int[3];
        lllIl[0] = (7 ^ 60) & ((133 ^ 190) ^ (-1));
        lllIl[1] = " ".length();
        lllIl[2] = "  ".length();
    }

    private static boolean lIIl(int i) {
        return i == 0;
    }
}
