package yuandp.wristband.property.library.glide;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import yuandp.wristband.property.library.R;

/**
 * @author：yuan
 * @data: 2017/5/24
 * @Description：
 */

public class GlideImgManager {

    /**
     * load normal  for img
     *
     * @param obliect
     * @param iv
     */
    public static void glideLoader(Context context,Object obliect, ImageView iv) {
        //原生 API
        Glide.with(context).load(obliect).placeholder(R.color.image_default).error(R.color.image_error).into(iv);
    }

    /**
     * load normal  for  circle or round img
     *
     * @param obliect
     * @param iv
     */
    public static void glideCircleLoader(Context context, Object obliect, ImageView iv) {
        Glide.with(context).load(obliect).placeholder(R.color.image_default).error(R.color.image_error).transform(new GlideCircleTransform(context)).into(iv);
    }

    /**
     * load normal  for  circle or round img
     *
     * @param obliect
     * @param iv
     * @param tag
     */
    public static void glideRoundLoader(Context context, Object obliect, ImageView iv, int tag) {
        Glide.with(context).load(obliect).placeholder(R.color.image_default).error(R.color.image_error).transform(new GlideRoundTransform(context,10)).into(iv);
    }

}
