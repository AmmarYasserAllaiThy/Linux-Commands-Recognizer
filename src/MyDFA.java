/**
 * @author Ammar Yasser
 */
public class MyDFA {

    private boolean isCommand(String command) {
        int currentState = 1;
        boolean accept = false;

        for (char ch : command.toCharArray()) {
            switch (currentState) {
                case 1:
                    switch (ch) {
                        case 'a':
                            currentState = 2;
                            break;
                        case 'b':
                            currentState = 3;
                            break;
                        case 'c':
                            currentState = 4;
                            break;
                        case 'd':
                            currentState = 5;
                            break;
                        case 'e':
                            currentState = 6;
                            break;
                        case 'f':
                            currentState = 7;
                            break;
                        case 'g':
                            currentState = 8;
                            break;
                        case 'h':
                            currentState = 9;
                            break;
                        case 'i':
                            currentState = 10;
                            break;
                        case 'k':
                            currentState = 11;
                            break;
                        case 'l':
                            currentState = 12;
                            break;
                        case 'm':
                            currentState = 13;
                            break;
                        case 'n':
                            currentState = 14;
                            break;
                        case 'p':
                            currentState = 15;
                            break;
                        case 'r':
                            currentState = 16;
                            break;
                        case 's':
                            currentState = 17;
                            break;
                        case 't':
                            currentState = 18;
                            break;
                        case 'u':
                            currentState = 19;
                            break;
                        case 'w':
                            currentState = 20;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 2:
                    switch (ch) {
                        case 'l':
                            currentState = 21;
                            break;
                        case 'p':
                            currentState = 22;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 3:
                    switch (ch) {
                        case 'a':
                            currentState = 23;
                            break;
                        case 'g':
                            currentState = 24;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 4:
                    switch (ch) {
                        case 'a':
                            currentState = 25;
                            break;
                        case 'd':
                            currentState = 26;
                            break;
                        case 'h':
                            currentState = 27;
                            break;
                        case 'l':
                            currentState = 28;
                            break;
                        case 'o':
                            currentState = 29;
                            break;
                        case 'p':
                            currentState = 30;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 5:
                    switch (ch) {
                        case 'a':
                            currentState = 31;
                            break;
                        case 'f':
                            currentState = 32;
                            break;
                        case 'i':
                            currentState = 33;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 6:
                    switch (ch) {
                        case 'c':
                            currentState = 34;
                            break;
                        case 'x':
                            currentState = 35;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 7:
                    switch (ch) {
                        case 'g':
                            currentState = 24;
                            break;
                        case 'i':
                            currentState = 37;
                            break;
                        case 'r':
                            currentState = 38;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 8:
                    switch (ch) {
                        case 'r':
                            currentState = 39;
                            break;
                        case 'z':
                            currentState = 40;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 9:
                    switch (ch) {
                        case 'e':
                            currentState = 41;
                            break;
                        case 'i':
                            currentState = 42;
                            break;
                        case 'o':
                            currentState = 43;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 10:
                    if (ch == 'd') {
                        currentState = 26;
                    } else {
                        return false;
                    }
                    break;

                case 11:
                    if (ch == 'i') {
                        currentState = 44;
                    } else {
                        return false;
                    }
                    break;

                case 12:
                    switch (ch) {
                        case 'e':
                            currentState = 45;
                            break;
                        case 'o':
                            currentState = 46;
                            break;
                        case 'p':
                            currentState = 47;
                            break;
                        case 's':
                            currentState = 48;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 13:
                    switch (ch) {
                        case 'a':
                            currentState = 49;
                            break;
                        case 'k':
                            currentState = 50;
                            break;
                        case 'o':
                            currentState = 51;
                            break;
                        case 'v':
                            currentState = 52;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 14:
                    if (ch == 't') {
                        currentState = 53;
                    } else {
                        return false;
                    }
                    break;

                case 15:
                    switch (ch) {
                        case 's':
                            currentState = 48;
                            break;
                        case 'w':
                            currentState = 54;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 16:
                    if (ch == 'm') {
                        currentState = 55;
                    } else {
                        return false;
                    }

                    break;

                case 17:
                    switch (ch) {
                        case 'o':
                            currentState = 56;
                            break;
                        case 's':
                            currentState = 57;
                            break;
                        case 'u':
                            currentState = 58;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 18:
                    switch (ch) {
                        case 'a':
                            currentState = 59;
                            break;
                        case 'o':
                            currentState = 60;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 19:
                    switch (ch) {
                        case 'm':
                            currentState = 61;
                            break;
                        case 'n':
                            currentState = 62;
                            break;
                        case 'p':
                            currentState = 63;
                            break;
                        case 's':
                            currentState = 64;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 20:
                    if (ch == 'h') {
                        currentState = 65;
                    } else {
                        return false;
                    }
                    break;

                case 21:
                    if (ch == 'i') {
                        currentState = 66;
                    } else {
                        return false;
                    }
                    break;

                case 22:
                    if (ch == 'r') {
                        currentState = 67;
                    } else {
                        return false;
                    }
                    break;

                case 23:
                    if (ch == 's') {
                        currentState = 57;
                    } else {
                        return false;
                    }
                    break;

                case 25:
                    switch (ch) {
                        case 'l':
                            currentState = 68;
                            break;
                        case 't':
                            currentState = 69;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 27:
                    switch (ch) {
                        case 'k':
                            currentState = 70;
                            break;
                        case 'm':
                            currentState = 71;
                            break;
                        case 'o':
                            currentState = 72;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 28:
                    if (ch == 'e') {
                        currentState = 73;
                    } else {
                        return false;
                    }
                    break;

                case 29:
                    if (ch == 'm') {
                        currentState = 74;
                    } else {
                        return false;
                    }
                    break;

                case 31:
                    if (ch == 't') {
                        currentState = 75;
                    } else {
                        return false;
                    }
                    break;

                case 33:
                    if (ch == 'f') {
                        currentState = 76;
                    } else {
                        return false;
                    }
                    break;

                case 34:
                    if (ch == 'h') {
                        currentState = 77;
                    } else {
                        return false;
                    }
                    break;

                case 35:
                    if (ch == 'i') {
                        currentState = 78;
                    } else {
                        return false;
                    }
                    break;

                case 37:
                    switch (ch) {
                        case 'n':
                            currentState = 54;
                            break;
                        case 'l':
                            currentState = 75;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 38:
                    if (ch == 'e') {
                        currentState = 75;
                    } else {
                        return false;
                    }
                    break;

                case 39:
                    if (ch == 'e') {
                        currentState = 79;
                    } else {
                        return false;
                    }
                    break;

                case 40:
                    if (ch == 'i') {
                        currentState = 79;
                    } else {
                        return false;
                    }
                    break;

                case 41:
                    if (ch == 'a') {
                        currentState = 54;
                    } else {
                        return false;
                    }
                    break;

                case 42:
                    if (ch == 's') {
                        currentState = 80;
                    } else {
                        return false;
                    }
                    break;

                case 43:
                    if (ch == 's') {
                        currentState = 81;
                    } else {
                        return false;
                    }
                    break;

                case 44:
                    if (ch == 'l') {
                        currentState = 82;
                    } else {
                        return false;
                    }
                    break;

                case 45:
                    if (ch == 's') {
                        currentState = 83;
                    } else {
                        return false;
                    }
                    break;

                case 46:
                    if (ch == 'c') {
                        currentState = 5;
                    } else {
                        return false;
                    }
                    break;

                case 47:
                    if (ch == 'r') {
                        currentState = 84;
                    } else {
                        return false;
                    }
                    break;

                case 49:
                    if (ch == 'n') {
                        currentState = 85;
                    } else {
                        return false;
                    }
                    break;

                case 50:
                    if (ch == 'd') {
                        currentState = 86;
                    } else {
                        return false;
                    }
                    break;

                case 51:
                    switch (ch) {
                        case 'r':
                            currentState = 75;
                            break;
                        case 'u':
                            currentState = 87;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 53:
                    if (ch == 'f') {
                        currentState = 88;
                    } else {
                        return false;
                    }
                    break;

                case 54:
                    if (ch == 'd') {
                        currentState = 26;
                    } else {
                        return false;
                    }
                    break;

                case 55:
                    if (ch == 'd') {
                        currentState = 86;
                    } else {
                        return false;
                    }
                    break;

                case 56:
                    if (ch == 'r') {
                        currentState = 78;
                    } else {
                        return false;
                    }
                    break;

                case 57:
                    if (ch == 'h') {
                        currentState = 89;
                    } else {
                        return false;
                    }
                    break;

                case 58:
                    if (ch == 'd') {
                        currentState = 77;
                    } else {
                        return false;
                    }
                    break;

                case 59:
                    switch (ch) {
                        case 'c':
                            currentState = 90;
                            break;
                        case 'r':
                            currentState = 84;
                            break;
                        case 'i':
                            currentState = 82;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 60:
                    switch (ch) {
                        case 'p':
                            currentState = 30;
                            break;
                        case 'u':
                            currentState = 91;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 61:
                    if (ch == 'o') {
                        currentState = 92;
                    } else {
                        return false;
                    }
                    break;

                case 62:
                    if (ch == 'a') {
                        currentState = 93;
                    } else {
                        return false;
                    }
                    break;

                case 63:
                    if (ch == 't') {
                        currentState = 94;
                    } else {
                        return false;
                    }
                    break;

                case 64:
                    if (ch == 'e') {
                        currentState = 95;
                    } else {
                        return false;
                    }
                    break;

                case 65:
                    if (ch == 'o') {
                        currentState = 96;
                    } else {
                        return false;
                    }
                    break;

                case 66:
                    if (ch == 'a') {
                        currentState = 83;
                    } else {
                        return false;
                    }
                    break;

                case 67:
                    if (ch == 'o') {
                        currentState = 97;
                    } else {
                        return false;
                    }
                    break;

                case 70:
                    if (ch == 'r') {
                        currentState = 115;
                    } else {
                        return false;
                    }
                    break;

                case 71:
                    if (ch == 'o') {
                        currentState = 54;
                    } else {
                        return false;
                    }
                    break;

                case 72:
                    if (ch == 'w') {
                        currentState = 49;
                    } else {
                        return false;
                    }
                    break;

                case 73:
                    if (ch == 'a') {
                        currentState = 47;
                    } else {
                        return false;
                    }
                    break;

                case 74:
                    if (ch == 'm') {
                        currentState = 98;
                    } else {
                        return false;
                    }
                    break;

                case 75:
                    if (ch == 'e') {
                        currentState = 99;
                    } else {
                        return false;
                    }
                    break;

                case 76:
                    if (ch == 'f') {
                        currentState = 32;
                    } else {
                        return false;
                    }
                    break;

                case 77:
                    if (ch == 'o') {
                        currentState = 104;
                    } else {
                        return false;
                    }
                    break;

                case 78:
                    if (ch == 't') {
                        currentState = 69;
                    } else {
                        return false;
                    }
                    break;

                case 79:
                    if (ch == 'p') {
                        currentState = 30;
                    } else {
                        return false;
                    }
                    break;

                case 80:
                    if (ch == 't') {
                        currentState = 102;
                    } else {
                        return false;
                    }
                    break;

                case 81:
                    if (ch == 't') {
                        currentState = 106;
                    } else {
                        return false;
                    }
                    break;

                case 82:
                    if (ch == 'l') {
                        currentState = 68;
                    } else {
                        return false;
                    }
                    break;

                case 83:
                    if (ch == 's') {
                        currentState = 48;
                    } else {
                        return false;
                    }
                    break;

                case 86:
                    if (ch == 'i') {
                        currentState = 47;
                    } else {
                        return false;
                    }
                    break;

                case 87:
                    if (ch == 'n') {
                        currentState = 108;
                    } else {
                        return false;
                    }
                    break;

                case 88:
                    if (ch == 's') {
                        currentState = 107;
                    } else {
                        return false;
                    }
                    break;

                case 91:
                    if (ch == 'c') {
                        currentState = 57;
                    } else {
                        return false;
                    }
                    break;

                case 92:
                    if (ch == 'u') {
                        currentState = 87;
                    } else {
                        return false;
                    }
                    break;

                case 93:
                    switch (ch) {
                        case 'l':
                            currentState = 21;
                            break;
                        case 'm':
                            currentState = 75;
                            break;
                        default:
                            return false;
                    }
                    break;

                case 94:
                    if (ch == 'i') {
                        currentState = 100;
                    } else {
                        return false;
                    }
                    break;

                case 95:
                    if (ch == 'r') {
                        currentState = 101;
                    } else {
                        return false;
                    }
                    break;

                case 96:
                    if (ch == 'a') {
                        currentState = 103;
                    } else {
                        return false;
                    }
                    break;

                case 97:
                    if (ch == 'p') {
                        currentState = 105;
                    } else {
                        return false;
                    }
                    break;

                case 100:
                    if (ch == 'm') {
                        currentState = 75;
                    } else {
                        return false;
                    }
                    break;

                case 101:
                    if (ch == 'a') {
                        currentState = 111;
                    } else {
                        return false;
                    }
                    break;
                case 102:
                    if (ch == 'o') {
                        currentState = 113;
                    } else {
                        return false;
                    }
                    break;

                case 103:
                    if (ch == 'm') {
                        currentState = 123;
                    } else {
                        return false;
                    }
                    break;

                case 105:
                    if (ch == 'o') {
                        currentState = 83;
                    } else {
                        return false;
                    }
                    break;

                case 106:
                    if (ch == 'n') {
                        currentState = 109;
                    } else {
                        return false;
                    }
                    break;

                case 107:
                    if (ch == 'f') {
                        currentState = 112;
                    } else {
                        return false;
                    }
                    break;

                case 108:
                    if (ch == 't') {
                        currentState = 110;
                    } else {
                        return false;
                    }
                    break;

                case 109:
                    if (ch == 'a') {
                        currentState = 100;
                    } else {
                        return false;
                    }
                    break;

                case 111:
                    if (ch == 'd') {
                        currentState = 54;
                    } else {
                        return false;
                    }
                    break;

                case 112:
                    if (ch == 'i') {
                        currentState = 114;
                    } else {
                        return false;
                    }
                    break;

                case 113:
                    if (ch == 'r') {
                        currentState = 120;
                    } else {
                        return false;
                    }
                    break;

                case 114:
                    if (ch == 'x') {
                        currentState = 122;
                    } else {
                        return false;
                    }
                    break;

                case 115:
                    if (ch == 'o') {
                        currentState = 116;
                    } else {
                        return false;
                    }
                    break;

                case 116:
                    if (ch == 'o') {
                        currentState = 117;
                    } else {
                        return false;
                    }
                    break;

                case 117:
                    if (ch == 't') {
                        currentState = 118;
                    } else {
                        return false;
                    }
                    break;

                case 118:
                    if (ch == 'k') {
                        currentState = 119;
                    } else {
                        return false;
                    }
                    break;

                case 119:
                    if (ch == 'i') {
                        currentState = 78;
                    } else {
                        return false;
                    }
                    break;

                case 120:
                    if (ch == 'y') {
                        currentState = 121;
                    } else {
                        return false;
                    }
                    break;

                case 123:
                    if (ch == 'i') {
                        currentState = 124;
                    } else {
                        return false;
                    }
                    break;

                default:
                    return false;
            }
        }
        for (int state : accepted) {
            if (currentState == state) {
                accept = true;
            }
        }
        return accept;
    }
    int[] accepted = {20, 24, 26, 30, 32, 48, 52, 55, 58, 68, 69, 84, 85, 89, 90, 96, 98, 99, 104, 110, 121, 122, 124};

}
