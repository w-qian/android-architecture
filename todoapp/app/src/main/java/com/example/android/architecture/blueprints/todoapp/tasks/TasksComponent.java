package com.example.android.architecture.blueprints.todoapp.tasks;

import com.example.android.architecture.blueprints.todoapp.ToDoApplication;
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepositoryComponent;
import com.example.android.architecture.blueprints.todoapp.util.FragmentScoped;
import com.example.android.architecture.blueprints.todoapp.util.schedulers.SchedulerProviderComponent;

import dagger.Component;

/**
 * This is a Dagger component. Refer to {@link ToDoApplication} for the list of Dagger components
 * used in this application.
 * <P>
 * Because this component depends on the {@link TasksRepositoryComponent}, which is a singleton, a
 * scope must be specified. All fragment components use a custom scope for this purpose.
 */
@FragmentScoped
@Component(dependencies = {TasksRepositoryComponent.class, SchedulerProviderComponent.class},
        modules = TasksPresenterModule.class)
public interface TasksComponent {
	
    void inject(TasksActivity activity);
}
