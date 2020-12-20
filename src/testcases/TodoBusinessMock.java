package testcases;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.BDDMockito;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class TodoBusinessMock {
	@Mock
	TodoService mockService;

	@InjectMocks
	TodoBusiness business;

	@Captor
	ArgumentCaptor<String> captor;

	@Spy
	ArrayList<String> spyList;

	@Test
	public void deletetodo_using_BDD() {
		// Given
		List<String> list = Arrays.asList("Use Hibernate Java", "Use Hibernate Core", "Use Hibernate",
				"Use Spring MVC");
		BDDMockito.given(mockService.getTodos("dummy")).willReturn(list);

		spyList.add("Mockito");
		spyList.add("Junit");

		// When
		business.deleteTodoNotRelatedToHibernate("dummy");

		// Then
		Mockito.verify(spyList).add("Mockito");
		Mockito.verify(spyList).add("Junit");

		Mockito.verify(mockService, Mockito.times(1)).deleteTodos("Use Spring MVC");
		Mockito.verify(mockService, Mockito.never()).deleteTodos("Use Hibernate Java");
		Mockito.verify(mockService, Mockito.never()).deleteTodos("Use Hibernate");

		assertEquals(2, spyList.size());
		System.out.println("Test is working");
	}
}
