package servletPackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletClass extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        TwitterState twitterState = new TwitterState();
        try {
            ObjectInputStream binaryInputFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("D:\\1_Software Engineering\\JavaPHP\\GitHubRepositories\\cis2454-summer2022-finalproject-Bellerophonn\\PhpFinalProject\\SaveFile.bin")));
            twitterState = (TwitterState) binaryInputFile.readObject();

            binaryInputFile.close();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (FileNotFoundException ex) {

        }
        //Changes Are Applid Here.
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String logoutCommand = request.getParameter("logout");
        String tweetText = request.getParameter("tweetText");
        String tweetImage = request.getParameter("tweetImage");
        String follow = request.getParameter("newFollow");
        String unfollow = request.getParameter("unFollow");
        if (!(username == null)) {
            int indexOfUser = 0;
            while (!twitterState.isLoggedIn()) {
                for (User user : twitterState.getUsers()) {
                    if (username.equalsIgnoreCase(user.getUserName()) && password.equalsIgnoreCase(user.getPassword())) {
                        twitterState.setLoggedIn(true);
                        twitterState.setUserIndex(indexOfUser);
                        break;
                    } else {
                        indexOfUser++;
                    }
                }
                if (!twitterState.isLoggedIn()) {
                    twitterState.addUser(username, password);
                }
            }
        }
        if (unfollow != null) {
            twitterState.getUsers().get(twitterState.getUserIndex()).removeFollowed(unfollow);
        }
        if (logoutCommand != null) {
            twitterState.setLoggedIn(false);
        }
        if ((tweetText != null) && (tweetImage == null)) {
            Tweet tweet = new Tweet(tweetText);
            twitterState.getUsers().get(twitterState.getUserIndex()).addTweet(tweet);
        } else if ((tweetText != null) && (tweetImage != null)) {
            Tweet tweet = new Tweet(tweetText, tweetImage);
            twitterState.getUsers().get(twitterState.getUserIndex()).addTweet(tweet);
        }
        if (follow != null) {
            twitterState.getUsers().get(twitterState.getUserIndex()).addFollowed(follow);
        }
        //Changes Are Applied Here.

        ObjectOutputStream binaryOutputFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("D:\\1_Software Engineering\\JavaPHP\\GitHubRepositories\\cis2454-summer2022-finalproject-Bellerophonn\\PhpFinalProject\\SaveFile.bin")));
        binaryOutputFile.writeObject(twitterState);
        binaryOutputFile.close();

        response.setContentType("text/html;charset=UTF-8");

        if (!twitterState.isLoggedIn()) {
            try ( PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet ServletClass</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Twitter Clone Logged Out</h1>");
                for (User user : twitterState.getUsers()) {
                    out.println(user.getUserName());
                }
                out.println("<form action=\"ServletClass\" method=\"post\">");
                out.println("<label>User Name</label>");
                out.println("<input type=\"text\" name=\"username\"/><br>");
                out.println("<label>Password</label>");
                out.println("<input type=\"password\" name=\"password\"/><br>");
                out.println("<input type=\"submit\" value=\"Login\"/>");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");
            }
        }

        if (twitterState.isLoggedIn()) {
            try ( PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet ServletClass</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Twitter Clone Logged In</h1>");
                out.println("<form action=\"ServletClass\" method=\"post\">");
                out.println("<input type=\"submit\" name=\"logout\" value=\"logout\"/><br>");
                out.println("</form>");
                out.println("List of twitter users:");
                for (User user : twitterState.getUsers()) {
                    out.println(user.getUserName());
                }
                out.println("<br>");
                out.println("Welcome to Twitter Clone " + twitterState.getUsers().get(twitterState.getUserIndex()).getUserName() + "!");
                out.println("Your existing tweets are listed below.<br>");
                for (Tweet tweet : twitterState.getUsers().get(twitterState.getUserIndex()).getTweets()) {
                    out.println(tweet.getTweetText());
                    out.println("<img src=" + tweet.getTweetImagePath() + ">");
                    out.println("<br>");
                }
                out.println("List of users you are following:");
                for (String name : twitterState.getUsers().get(twitterState.getUserIndex()).getFollowed()) {
                    out.println(name);
                }
                out.println("<form action=\"ServletClass\" method=\"post\">");
                out.println("<label>Tweet Something!</label>");
                out.println("<input type=\"text\" name=\"tweetText\"/><br>");
                out.println("<label>Add an image to your tweet by putting the path to the image here (in quotes)!</label>");
                out.println("<input type=\"text\" name=\"tweetImage\"/><br>");
                out.println("<input type=\"submit\" value=\"Tweet!\"/>");
                out.println("</form>");
                out.println("<form action=\"ServletClass\" method=\"post\">");
                out.println("<label>Type the name of the person you want to follow.</label>");
                out.println("<input type=\"text\" name=\"newFollow\"/><br>");
                out.println("<input type=\"submit\" value=\"Follow!\"/>");
                out.println("</form>");
                out.println("<label>Type the name of the person you want to unfollow.</label>");
                out.println("<input type=\"text\" name=\"unFollow\"/><br>");
                out.println("<input type=\"submit\" value=\"unFollow!\"/>");
                out.println("</form>");
                out.println("<br>");
                out.println("Listed below are the tweets of those you follow.");
                out.println("<br>");
                for (String name : twitterState.getUsers().get(twitterState.getUserIndex()).getFollowed()) {
                    for (User user : twitterState.getUsers()) {
                        if (name.equalsIgnoreCase(user.getUserName())) {
                            for (Tweet tweet : user.getTweets()) {
                                out.println(name + ": ");
                                out.println(tweet.getTweetText());
                                out.println("-Likes: " + tweet.getLikeCount());
                                out.println("<br>");
                            }
                        }
                    }
                }
                out.println("</body>");
                out.println("</html>");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
