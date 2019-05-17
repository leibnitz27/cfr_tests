.class public CreateTest2
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
    new CreateTest2
    dup
    dup
    aload_0
    swap
    dup
    pop
    swap
    arraylength
    ifne branch

    iconst_2
    invokespecial CreateTest2/<init>(I)V
    goto rest
branch:
    dup
    aload_0
    arraylength
    iconst_1
    if_icmpeq branch2
    pop
    iconst_3
    invokenonvirtual CreateTest2/<init>(I)V
    goto rest
branch2:
    pop
    iconst_5
    invokenonvirtual CreateTest2/<init>(I)V 
rest:
    invokevirtual CreateTest2/foo()V
    invokevirtual CreateTest2/foo()V
    return
.end method

