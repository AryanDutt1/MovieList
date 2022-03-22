package au.edu.unsw.infs2605.movielist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MovieController {



 @FXML
 ImageView myImageView1;

 Image myImage = new Image(getClass().getResourceAsStream("shawshank.jpg"));

 public void displayImage() {



 }


    @FXML
    private Button textNewMovie;

    @FXML
    private Text Cast;

    @FXML
    private Text Cast_;

    @FXML
    private Button CreateaMovie;

    @FXML
    private Text Director;

    @FXML
    private Text Director_;

    @FXML
    private Button EditMovie;

    @FXML
    private Text FilmRating;

    @FXML
    private Text Film_Rating;

    @FXML
    private Label MovieName;

    @FXML
    private Text Movie_name;

    @FXML
    private MenuButton Moviebelow;


    @FXML
    private Button Moviefour;

    @FXML
    private Button Movieone;

    @FXML
    private Button Moviethree;

    @FXML
    private Button Movietwo;

    @FXML
    private Label ReleaseDate;

    @FXML
    private Text Release_Date;

    @FXML
    private Text RunningTime;

    @FXML
    private Text Running_Time;

    @FXML
    private Label Synopsis;

    @FXML
    private Text Synpopsis_;

    @FXML
    private TextField sixthtext;

    @FXML
    private TextField fourthtext;

    @FXML
    private TextField firsttext;

    @FXML
    private TextField seventhtext;

    @FXML
    private TextField thirdtext;

    @FXML
    private TextField secondtext;

    @FXML
    private TextField fifthtext;

    @FXML
    private TextField submitBox;

    @FXML
    private Button Submit;

    @FXML
    private Button Movie1;

    @FXML
    private Text FilmRating1;

    @FXML
    private Text Director1;

    @FXML
    private Text ReleaseDate1;

    @FXML
    private Text RunningTime1;

    @FXML
    private Text Cast1;

    @FXML
    private Text newDate;

    @FXML
    private Text dateTime;

    @FXML
    private Text Synopsis1;

    @FXML
    private Text Like_Number;

    @FXML
    private Text Dislike_Number;

    @FXML
    private Text LastRating;

    @FXML
    private ListView<Button> listview;

    @FXML
    private Label counter;

    @FXML
    private Label dcounter;



    @FXML
    private void firstMovie(ActionEvent event) {
        Movie_name.setText("The Dark Knight");
        Director_.setText("Christopher Nolan");
        Release_Date.setText("16/07/2008");
        Running_Time.setText("152 mins");
        Film_Rating.setText("M");
        Synpopsis_.setText("After Gordon, Dent and Batman begin an assault on Gotham's organised crime, the mobs hire the Joker, a psychopathic criminal mastermind who offers to kill Batman and bring the city to its knees.");
        Cast_.setText("Christian Bale, Heath Ledger, Aaron Eckhart");

        counter.setText("200");
        dcounter.setText("5");
    }

    @FXML
    private void secondMovie(ActionEvent event) {
        Movie_name.setText("The Hangover");
        Director_.setText("Todd Phillips");
        Release_Date.setText("11/06/2009");
        Running_Time.setText("100 mins");
        Film_Rating.setText("MA15+");
        Synpopsis_.setText("Doug and his three best men go to Las Vegas to celebrate his bachelor party. However, the three best men wake up the next day with a hangover and realise that Doug is missing.");
        Cast_.setText("Zach Galifianakis, Ed Helms, Bradley Cooper, Ken Jeong");
        counter.setText("145");
        dcounter.setText("22");
    }

    @FXML
    private void thirdMovie(ActionEvent event) {
        Movie_name.setText("The Shawshank Redemption ");
        Director_.setText("Frank Darabont");
        Release_Date.setText("16/02/1995");
        Running_Time.setText("142 mins");
        Film_Rating.setText("MA15+");
        Synpopsis_.setText("Andy Dufresne, a successful banker, is arrested for the murders of his wife and her lover, and is sentenced to life imprisonment at the Shawshank prison. He becomes the most unconventional prisoner.");
        Cast_.setText(" Morgan Freeman, Tim Robbins, Bob Gunton");
        counter.setText("1001");
        dcounter.setText("5");
    }

    @FXML
    private void fourthMovie(ActionEvent event) {
        Movie_name.setText("Project X");
        Director_.setText("Nima Nourizadeh");
        Release_Date.setText("01/03/2012");
        Running_Time.setText("88 mins");
        Film_Rating.setText("MA15+");
        Synpopsis_.setText("Three high school seniors decide to throw a party in order to gain popularity among their peers. However, their plan soon spirals out of control when news of their party quickly gets out.");
        Cast_.setText("Thomans Mann, Oliver Cooper, Kirby Blanton");
        counter.setText("121");
        dcounter.setText("52");

    }

    @FXML
    private void addMovie(ActionEvent event) {
       
        Movie1.setText(firsttext.getText());
        FilmRating1.setText(secondtext.getText());
        Synopsis1.setText(thirdtext.getText());
        RunningTime1.setText(fourthtext.getText());
        ReleaseDate1.setText(fifthtext.getText());
        Director1.setText(sixthtext.getText());
        Cast1.setText(seventhtext.getText());

    }

    @FXML
    private void editMovieDetails(ActionEvent event) {
        textNewMovie.setText(Movie1.getText());
        Director_.setText(Director1.getText());
        Movie_name.setText(Movie1.getText());
        Running_Time.setText(RunningTime1.getText());
        Release_Date.setText(ReleaseDate1.getText());
        Director_.setText(Director1.getText());
        Cast_.setText(Cast1.getText());
    }




    @FXML

    public void increment(ActionEvent e) {
        int num = Integer.parseInt(counter.getText());
        counter.setText(Integer.toString(num+1));
        DateFormat df = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
        Date dateobjective = new Date();
        dateTime.setText(df.format(dateobjective));

    }

    @FXML

    public void decrement(ActionEvent e) {
        int num = Integer.parseInt(dcounter.getText());
        dcounter.setText(Integer.toString(num+1));
        DateFormat df = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
        Date dateobjective = new Date();
        dateTime.setText(df.format(dateobjective));

    }
    public void initialize() {
        //
    }


}