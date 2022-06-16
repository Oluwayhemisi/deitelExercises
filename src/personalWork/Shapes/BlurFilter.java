package personalWork.Shapes;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class BlurFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
