package maven.Mockito.data.api;

import java.util.List;

public interface TodoService {
	public List<String> retrieveTodos(String user);
}
