package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.C4789l;
import kotlinx.coroutines.C12248i0;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo16641d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "owner", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "getOwner", "()Lkotlinx/coroutines/flow/FlowCollector;", "fillInStackTrace", "", "kotlinx-coroutines-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* compiled from: FlowExceptions.kt */
public final class AbortFlowException extends CancellationException {
    public Throwable fillInStackTrace() {
        if (C12248i0.m40398c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
