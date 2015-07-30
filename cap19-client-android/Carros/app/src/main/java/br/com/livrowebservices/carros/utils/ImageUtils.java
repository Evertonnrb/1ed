package br.com.livrowebservices.carros.utils;

import android.content.Context;
import android.webkit.URLUtil;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import br.com.livrowebservices.carros.R;

/**
 * Created by ricardo on 30/07/15.
 */
public class ImageUtils {
    public static void setImage(Context context, String url_img, ImageView img) {
        if(url_img != null && url_img.trim().length() > 0 && URLUtil.isValidUrl(url_img)) {
            Picasso.with(context).load(url_img).placeholder(R.drawable.placeholder).into(img);
        } else {
            img.setImageResource(R.drawable.placeholder);
        }
    }
}