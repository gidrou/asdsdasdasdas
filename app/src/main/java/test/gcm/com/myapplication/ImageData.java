package test.gcm.com.myapplication;
import android.graphics.Bitmap;
/**
 * Created by JungYoungHoon on 2017-04-21.
*/

public class ImageData {
    String name;    //이름
    Bitmap bitmap;      //이미지의 리소스 아이디
    String recv_ck_md5;
    String make_ck_md5;

    public ImageData(String name, Bitmap bitmap, String make_ck_md5, String recv_ck_md5) {
        // TODO Auto-generated constructor stub
        //생성자함수로 전달받은 Member의 정보를 멤버변수에 저장..
        this.name = name;
        this.bitmap = bitmap;
        this.make_ck_md5 = make_ck_md5;
        this.recv_ck_md5 = recv_ck_md5;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImg(Bitmap imgId) {
        this.bitmap = bitmap;
    }

    public void set_Ck_make_md5(String make_ck_md5) {
        this.make_ck_md5 = make_ck_md5;
    }

    public void set_Ck_recv_md5(String recv_ck_md5) {
        this.recv_ck_md5 = recv_ck_md5;
    }

    public String getName() {
        return name;
    }

    public Bitmap getImgId() {
        return bitmap;
    }

    public String get_make_ck_md5() {
        return make_ck_md5;
    }
    public String get_recv_ck_md5() {
        return recv_ck_md5;
    }
}
