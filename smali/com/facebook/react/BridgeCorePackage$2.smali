.class Lcom/facebook/react/BridgeCorePackage$2;
.super Ljava/lang/Object;
.source "BridgeCorePackage.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/BridgeCorePackage;->getNativeModules(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider",
        "<",
        "Lcom/facebook/react/bridge/NativeModule;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/BridgeCorePackage;

.field final synthetic val$reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method constructor <init>(Lcom/facebook/react/BridgeCorePackage;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0
    .param p1, "this$0"    # Lcom/facebook/react/BridgeCorePackage;

    .prologue
    .line 71
    iput-object p1, p0, Lcom/facebook/react/BridgeCorePackage$2;->this$0:Lcom/facebook/react/BridgeCorePackage;

    iput-object p2, p0, Lcom/facebook/react/BridgeCorePackage$2;->val$reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Lcom/facebook/react/bridge/NativeModule;
    .locals 3

    .prologue
    .line 74
    new-instance v0, Lcom/facebook/react/modules/core/DeviceEventManagerModule;

    iget-object v1, p0, Lcom/facebook/react/BridgeCorePackage$2;->val$reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    iget-object v2, p0, Lcom/facebook/react/BridgeCorePackage$2;->this$0:Lcom/facebook/react/BridgeCorePackage;

    invoke-static {v2}, Lcom/facebook/react/BridgeCorePackage;->access$000(Lcom/facebook/react/BridgeCorePackage;)Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/modules/core/DeviceEventManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 71
    invoke-virtual {p0}, Lcom/facebook/react/BridgeCorePackage$2;->get()Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    return-object v0
.end method
