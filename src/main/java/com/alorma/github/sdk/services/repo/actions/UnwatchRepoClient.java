package com.alorma.github.sdk.services.repo.actions;

import android.content.Context;

import com.alorma.github.sdk.services.client.GithubClient;

import retrofit.RestAdapter;

/**
 * Created by Bernat on 07/08/2014.
 */
public class UnwatchRepoClient extends GithubClient<Object> {

    private final String owner;
    private final String repo;

    public UnwatchRepoClient(Context context, String owner, String repo) {
        super(context);
        this.owner = owner;
        this.repo = repo;
    }

    @Override
    protected void executeService(RestAdapter restAdapter) {
        restAdapter.create(ActionsService.class).unwatchRepo(owner, repo, this);
    }
}
