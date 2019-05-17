.class public CreateTest
.super java/lang/Object

;
; standard initializer
;
.method public <init>(I)V
   .limit stack 4
   .limit locals 4
   aload_0

   invokenonvirtual java/lang/Object/<init>()V
   return
.end method

.method public foo()V
   .limit stack 2

   ; print a simple message
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "Hello"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

   ; done
   return
.end method

.method public static main([Ljava/lang/String;)V
    .limit stack 6

    ; create a new one of me
    new CreateTest
    dup
    aload_0
    arraylength
    ifne branch

    iconst_2
    invokenonvirtual CreateTest/<init>(I)V
    goto rest
branch:
    iconst_3
    invokenonvirtual CreateTest/<init>(I)V 
rest:
    invokevirtual CreateTest/foo()V

    return
.end method

