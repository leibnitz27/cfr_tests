package org.benf.cfr.tests;

public class AnnotationNested {
    public class Fred {
        public class Jim {
            public class Alan {
            }
        }
    }

    public Fred.Jim.Alan getAlan() {
        return null;
    }
}
