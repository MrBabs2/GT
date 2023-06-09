package android.support.p001v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.media.session.MediaSessionCompat;
import p050l.p066e.C4868a;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new C0007a();

    /* renamed from: h */
    static final C4868a<String, Integer> f29h;

    /* renamed from: f */
    final Bundle f30f;

    /* renamed from: g */
    private Object f31g;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    static class C0007a implements Parcelable.Creator<MediaMetadataCompat> {
        C0007a() {
        }

        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C4868a<String, Integer> aVar = new C4868a<>();
        f29h = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        f29h.put("android.media.metadata.ARTIST", 1);
        f29h.put("android.media.metadata.DURATION", 0);
        f29h.put("android.media.metadata.ALBUM", 1);
        f29h.put("android.media.metadata.AUTHOR", 1);
        f29h.put("android.media.metadata.WRITER", 1);
        f29h.put("android.media.metadata.COMPOSER", 1);
        f29h.put("android.media.metadata.COMPILATION", 1);
        f29h.put("android.media.metadata.DATE", 1);
        f29h.put("android.media.metadata.YEAR", 0);
        f29h.put("android.media.metadata.GENRE", 1);
        f29h.put("android.media.metadata.TRACK_NUMBER", 0);
        f29h.put("android.media.metadata.NUM_TRACKS", 0);
        f29h.put("android.media.metadata.DISC_NUMBER", 0);
        f29h.put("android.media.metadata.ALBUM_ARTIST", 1);
        f29h.put("android.media.metadata.ART", 2);
        f29h.put("android.media.metadata.ART_URI", 1);
        f29h.put("android.media.metadata.ALBUM_ART", 2);
        f29h.put("android.media.metadata.ALBUM_ART_URI", 1);
        f29h.put("android.media.metadata.USER_RATING", 3);
        f29h.put("android.media.metadata.RATING", 3);
        f29h.put("android.media.metadata.DISPLAY_TITLE", 1);
        f29h.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        f29h.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        f29h.put("android.media.metadata.DISPLAY_ICON", 2);
        f29h.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        f29h.put("android.media.metadata.MEDIA_ID", 1);
        f29h.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        f29h.put("android.media.metadata.MEDIA_URI", 1);
        f29h.put("android.media.metadata.ADVERTISEMENT", 0);
        f29h.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f30f = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: a */
    public static MediaMetadataCompat m19a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        C0016f.m47a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f31g = obj;
        return createFromParcel;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f30f);
    }
}
