package aula46_interface_heranca;

public interface SqlDDL {

	void create(String query);

	void alter(String query);

	void drop(String query);

}
