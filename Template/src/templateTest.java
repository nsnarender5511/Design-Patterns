import com.narender.Template.CSVDataRenderer;
import com.narender.Template.DataRenderer;
import com.narender.Template.XMLDataRender;

public class templateTest {
    public static void main(String[] args){
        DataRenderer dataRenderer = new CSVDataRenderer();
        dataRenderer.render();
    }
}
