package com.example.android.architecture.blueprints.todoapp.data.source;

import android.content.Context;

import com.example.android.architecture.blueprints.todoapp.data.FakeTasksRemoteDataSource;
import com.example.android.architecture.blueprints.todoapp.data.source.local.TasksLocalDataSource;
import com.example.android.architecture.blueprints.todoapp.util.schedulers.BaseSchedulerProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * This is used by Dagger to inject the required arguments into the {@link TasksRepository}.
 */
@Module
public class TasksRepositoryModule {

    @Singleton
    @Provides
    @Local
    TasksDataSource provideTasksLocalDataSource(Context context, BaseSchedulerProvider schedulerProvider) {
        return new TasksLocalDataSource(context, schedulerProvider);
    }

    @Singleton
    @Provides
    @Remote
    TasksDataSource provideTasksRemoteDataSource() {
        return new FakeTasksRemoteDataSource();
    }

}