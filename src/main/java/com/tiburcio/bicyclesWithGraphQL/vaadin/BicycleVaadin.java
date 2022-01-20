package com.tiburcio.bicyclesWithGraphQL.vaadin;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.tiburcio.bicyclesWithGraphQL.entity.models.Bicycle;
import com.tiburcio.bicyclesWithGraphQL.services.IBicycleService;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class BicycleVaadin extends VerticalLayout {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1081784188024417L;

	@Autowired
	private IBicycleService bicycleService;

	public List<Bicycle> getBicycles() {
		return bicycleService.getAll();
	}

	@PostConstruct
	private void postConstruct() {
		doSomething();
	}

	private void doSomething() {
		List<Bicycle> bicycles = getBicycles();


		VerticalLayout todosList = new VerticalLayout();
		TextField taskField = new TextField();
		Button addButton = new Button("Add");
		addButton.addClickListener(click -> {
			Checkbox checkbox = new Checkbox(taskField.getValue());
			todosList.add(checkbox);
		});
		addButton.addClickShortcut(Key.ENTER);

		for (int i = 0; i < bicycles.size(); i++) {
			String thisBike = bicycles.get(i).getBrand() + " - " + bicycles.get(i).getModel();
			todosList.add(new Checkbox(thisBike));
		}

		add(new H1("Bicycle List"), todosList, new HorizontalLayout(taskField, addButton));
	}
}
