

.class public SneakyFinally
.super java/lang/Object

;
; standard initializer
.method public <init>()V
   aload_0
 
   invokenonvirtual java/lang/Object/<init>()V
   return
.end method

.method static public foo()V
   .limit stack 40
   .limit locals 4
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "HERE"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 

    new java/lang/Exception
    dup
    invokenonvirtual java/lang/Exception/<init>()V
    athrow

   return
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 40
   .limit locals 4

.catch java/lang/Throwable from l1 to t1 using t1
.catch all from l1 to l2 using l33
.catch all from t1 to l22 using l33
l1:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "TryBlock"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V  
l2:
    invokestatic SneakyFinally/foo()V
    goto 44
t1:
    astore_2
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "There"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
l22:
    invokestatic SneakyFinally/foo()V
    goto 44
l33:
    astore_3
    invokestatic SneakyFinally/foo()V
    aload_3
    athrow
44: return
.end method
