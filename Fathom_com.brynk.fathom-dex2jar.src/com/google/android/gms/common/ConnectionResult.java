package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.internal.zzz.zza;

public final class ConnectionResult extends AbstractSafeParcelable
{
  public static final int API_UNAVAILABLE = 16;
  public static final int CANCELED = 13;
  public static final Parcelable.Creator<ConnectionResult> CREATOR;
  public static final int DEVELOPER_ERROR = 10;

  @Deprecated
  public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
  public static final int INTERNAL_ERROR = 8;
  public static final int INTERRUPTED = 15;
  public static final int INVALID_ACCOUNT = 5;
  public static final int LICENSE_CHECK_FAILED = 11;
  public static final int NETWORK_ERROR = 7;
  public static final int RESOLUTION_REQUIRED = 6;
  public static final int RESTRICTED_PROFILE = 20;
  public static final int SERVICE_DISABLED = 3;
  public static final int SERVICE_INVALID = 9;
  public static final int SERVICE_MISSING = 1;
  public static final int SERVICE_MISSING_PERMISSION = 19;
  public static final int SERVICE_UPDATING = 18;
  public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
  public static final int SIGN_IN_FAILED = 17;
  public static final int SIGN_IN_REQUIRED = 4;
  public static final int SUCCESS = 0;
  public static final int TIMEOUT = 14;
  public static final ConnectionResult wO = new ConnectionResult(0);
  private final PendingIntent mPendingIntent;
  final int mVersionCode;
  private final int uo;
  private final String wP;

  static
  {
    CREATOR = new zzb();
  }

  public ConnectionResult(int paramInt)
  {
    this(paramInt, null, null);
  }

  ConnectionResult(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString)
  {
    this.mVersionCode = paramInt1;
    this.uo = paramInt2;
    this.mPendingIntent = paramPendingIntent;
    this.wP = paramString;
  }

  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent)
  {
    this(paramInt, paramPendingIntent, null);
  }

  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent, String paramString)
  {
    this(1, paramInt, paramPendingIntent, paramString);
  }

  static String getStatusString(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return 31 + "UNKNOWN_ERROR_CODE(" + paramInt + ")";
    case 0:
      return "SUCCESS";
    case 1:
      return "SERVICE_MISSING";
    case 2:
      return "SERVICE_VERSION_UPDATE_REQUIRED";
    case 3:
      return "SERVICE_DISABLED";
    case 4:
      return "SIGN_IN_REQUIRED";
    case 5:
      return "INVALID_ACCOUNT";
    case 6:
      return "RESOLUTION_REQUIRED";
    case 7:
      return "NETWORK_ERROR";
    case 8:
      return "INTERNAL_ERROR";
    case 9:
      return "SERVICE_INVALID";
    case 10:
      return "DEVELOPER_ERROR";
    case 11:
      return "LICENSE_CHECK_FAILED";
    case 13:
      return "CANCELED";
    case 14:
      return "TIMEOUT";
    case 15:
      return "INTERRUPTED";
    case 16:
      return "API_UNAVAILABLE";
    case 17:
      return "SIGN_IN_FAILED";
    case 18:
      return "SERVICE_UPDATING";
    case 19:
      return "SERVICE_MISSING_PERMISSION";
    case 20:
      return "RESTRICTED_PROFILE";
    case 21:
      return "API_VERSION_UPDATE_REQUIRED";
    case 1500:
      return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
    case 99:
      return "UNFINISHED";
    case -1:
    }
    return "UNKNOWN";
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    do
    {
      return true;
      if (!(paramObject instanceof ConnectionResult))
        return false;
      paramObject = (ConnectionResult)paramObject;
    }
    while ((this.uo == paramObject.uo) && (zzz.equal(this.mPendingIntent, paramObject.mPendingIntent)) && (zzz.equal(this.wP, paramObject.wP)));
    return false;
  }

  public int getErrorCode()
  {
    return this.uo;
  }

  @Nullable
  public String getErrorMessage()
  {
    return this.wP;
  }

  @Nullable
  public PendingIntent getResolution()
  {
    return this.mPendingIntent;
  }

  public boolean hasResolution()
  {
    return (this.uo != 0) && (this.mPendingIntent != null);
  }

  public int hashCode()
  {
    return zzz.hashCode(new Object[] { Integer.valueOf(this.uo), this.mPendingIntent, this.wP });
  }

  public boolean isSuccess()
  {
    return this.uo == 0;
  }

  public void startResolutionForResult(Activity paramActivity, int paramInt)
    throws IntentSender.SendIntentException
  {
    if (!hasResolution())
      return;
    paramActivity.startIntentSenderForResult(this.mPendingIntent.getIntentSender(), paramInt, null, 0, 0, 0);
  }

  public String toString()
  {
    return zzz.zzx(this).zzg("statusCode", getStatusString(this.uo)).zzg("resolution", this.mPendingIntent).zzg("message", this.wP).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:           C:\Users\c_jealom1\Documents\Scripts\Android\Fathom_com.brynk.fathom\Fathom_com.brynk.fathom-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.ConnectionResult
 * JD-Core Version:    0.6.0
 */