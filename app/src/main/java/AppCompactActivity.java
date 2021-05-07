import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public abstract class AppCompactActivity {
    protected abstract void onCreate(Bundle savedInstanceState);

    protected abstract void setAdapter(ArrayAdapter<String> adapter);
}
