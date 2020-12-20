package testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.Is;
import org.junit.Test;
import org.mockito.Mockito;

/* MOCKITO - is a mocking framework.
 *  It is a Java-based library used to create simple and basic test APIs for performing
   	unit testing of Java applications.
 *  It can also be used with other frameworks such as JUnit and TestNG.
 *  
 *  Methods - mock , spy , reset , verify , verifyNoMoreInteractions ,
  	verifyZeroInteractions , doThrow , doCallRealMethod , doAnswer 
  	, doNothing , doReturn , inOrder , ignoreStubs , times , never
  	, atLeastOnce , atLeast , atMost , calls , only , timeout , after , validateMockitoUsage , withSettings , 
*/

public class Demo03Mockito {
	@Test
	public void testTodoBussinessClass_getTodosForSpring() {
		TodoService todoService = new TodoServiceStub();

		TodoBussiness bussiness = new TodoBussiness(todoService);
		List<String> retrieveTodos = bussiness.getTodosForSpring("MVC");
		System.out.println("list of retrived todos: " + retrieveTodos);
		assertEquals(1, retrieveTodos.size());
		System.out.println("Stub is working correctly");
	}

	@Test
	public void test_todobussinessclass_getTodosForSpring_with_mockito() {
		TodoService doService = Mockito.mock(TodoService.class);
		List<String> list = Arrays.asList("Use Core Java", " Use Spring Core", " Use w3eHibernate", " Use Spring MVC");
		Mockito.when(doService.getTodos("Spring")).thenReturn(list);

		TodoBussiness bussiness = new TodoBussiness(doService);
		List<String> retrievedTodos = bussiness.getTodosForSpring("Spring");

		System.out.println("retrived todos: " + retrievedTodos);
		assertEquals(2, retrievedTodos.size());
	}

	@Test
	public void test_list_return_single_value_using_mockito() {
		List<String> list = Mockito.mock(List.class);
		List<String> list2 = Mockito.mock(List.class);

		Mockito.when(list.size()).thenReturn(1);
		Mockito.when(list2.size()).thenReturn(1).thenReturn(2).thenReturn(3);
		Mockito.when(list2.get(0)).thenReturn("Mockito");
		assertEquals(1, list.size());
		System.out.println("MockList1 size: " + list.size());

		assertEquals(1, list2.size());
		assertEquals(2, list2.size());
		assertEquals(3, list2.size());
		System.out.println("MockList2 size: " + list2.size());

		assertEquals("Mockito", list2.get(0));
		System.out.println("list2.get(0) " + list2.get(0));
	}

	@Test
	public void test_list_with_mockito_spy_method() {
		List<String> spyList = Mockito.spy(ArrayList.class);
		// checking size of spy list before adding any element
		assertEquals(0, spyList.size());

		// checking after adding element
		spyList.add("Mockito");
		assertEquals(1, spyList.size());

	}

	@Test
	public void test_list_with_spy_for_argument_matchers() {
		List<String> mocklist = Mockito.mock(ArrayList.class);

		Mockito.when(mocklist.get(Mockito.anyInt())).thenReturn("Mockito");

		assertEquals("Mockito", mocklist.get(0));
		assertEquals("Mockito", mocklist.get(1));
		assertEquals("Mockito", mocklist.get(20));

		// BDD test (behavioral driven development test)
		assertThat(mocklist.get(0), Is.is("Mockito"));
	}
}

