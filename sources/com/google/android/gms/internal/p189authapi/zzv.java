package com.google.android.gms.internal.p189authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzv */
public abstract class zzv extends zzd implements zzu {
    public zzv() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo24817a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo29943a((Status) zze.m25782a(parcel, Status.CREATOR), (Credential) zze.m25782a(parcel, Credential.CREATOR));
        } else if (i == 2) {
            mo29945i((Status) zze.m25782a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo29944a((Status) zze.m25782a(parcel, Status.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
