class Solution1 {
    public String simplifyPath(String path) {
        String[] directories = path.split("/");
        int indexOfLastDir = -1;
        for (int i = 0; i < directories.length; ++i) {
            if (directories[i].equals("") || directories[i].equals(".")) {
                directories[i] = null;
            } else if (directories[i].equals("..")) {
                if (indexOfLastDir >= 0) {
                    directories[indexOfLastDir] = null;
                    while (indexOfLastDir >= 0) {
                        if (directories[indexOfLastDir] == null) {
                            indexOfLastDir--;
                        } else {
                            break;
                        }
                    }
                }
                directories[i] = null;
            } else {
                indexOfLastDir = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : directories) {
            if (s != null) {
                sb.append("/").append(s);
            }
        }
        if (sb.length() == 0) {
            return "/";
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();

        System.out.println(s.simplifyPath("/home/"));
        System.out.println(s.simplifyPath("/../"));
        System.out.println(s.simplifyPath("/home//foo/"));
        System.out.println(s.simplifyPath("/a/./b/../../c/"));
        System.out.println(s.simplifyPath("/a/../../b/../c//.//"));
        System.out.println(s.simplifyPath("/a//b////c/d//././/.."));
    }
}