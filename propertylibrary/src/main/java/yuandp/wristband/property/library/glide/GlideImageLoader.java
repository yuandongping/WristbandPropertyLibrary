package yuandp.wristband.property.library.glide;

import android.app.Activity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.lzy.imagepicker.loader.ImageLoader;

import yuandp.wristband.property.library.R;


/**
 * @author：yuan
 * @data: 2017/6/9
 * @Description：本地图片选择
 */
public class GlideImageLoader implements ImageLoader {

    @Override
    public void displayImage(Activity activity, String path, ImageView imageView, int width, int height) {
        Glide
                .with(activity)
                .load(path)
                .placeholder(R.color.image_default)
                .error(R.color.image_error)
                .override(width, height)
                .centerCrop()
                .into(imageView);
    }

    @Override
    public void clearMemoryCache() {
        //这里是清除缓存的方法,根据需要自己实现
    }

}
