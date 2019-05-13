package org.benf.cfr.tests;

public class FinalBlowup {
    public String foo(int x) {
        foo : try {
            switch (x) {
                case 0:
                    System.out.println("Hey");
                    break foo;
                case 1:
                    System.out.println("Hey");
                    break foo;
                case 2:
                    System.out.println("Hey");
                    break foo;
                case 3:
                    System.out.println("Hey");
                    break foo;
                case 4:
                    System.out.println("Hey");
                    break foo;
                case 5:
                    System.out.println("Hey");
                    break foo;
                case 7:
                    System.out.println("Hey");
                    break foo;
                case 10:
                    System.out.println("Hey");
                    break foo;
                case 11:
                    System.out.println("Hey");
                    break foo;
            }
       } finally {
            try {
                switch (x) {
                    case 0:
                        return "Jennifer";
                    case 1:
                        return "Alison";
                    case 2:
                        return "Phillipa";
                    case 6:
                        return "Alison";
                    case 8:
                        return "Phillipa";
                }
            } finally {
                switch (x) {
                    case 4:
                        return "Jennifer";
                    case 5:
                        return "Alison";
                    case 7:
                        return "Phillipa";
                    case 8:
                        return "Jennifer";
                    case 9:
                        return "Alison";
                    case 10:
                        return "Phillipa";
                    case 11:
                        return "Alison";
                    case 12:
                        return "Phillipa";
                    case 18:
                        return "Alison";
                    case 19:
                        return "Phillipa";
                }
            }
        }
        return "Sue";
    }
}
