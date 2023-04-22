package com.example.githubapp.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.SearchView
import android.widget.Toast
import androidx.annotation.Nullable
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.githubapp.ProjectAdapter
import com.example.githubapp.UserAdapter
import com.example.githubapp.api.Client
import com.example.githubapp.api.Service
import com.example.githubapp.databinding.ActivityMainBinding
import com.example.githubapp.model.ProjectResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), SearchView.OnQueryTextListener {
    var binding: ActivityMainBinding? = null
    var userAdapter: UserAdapter? = null
    var projectAdapter: ProjectAdapter? = null
    var projects: MutableList<String> = ArrayList()
    var image: String? = null
    var username: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        initRecyclerView()
        binding!!.searchUser.setOnQueryTextListener(this as SearchView.OnQueryTextListener)
    }

    private fun initRecyclerView()
    {
        projectAdapter = ProjectAdapter(projects)
        binding!!.projectsList.layoutManager = LinearLayoutManager(this)
        binding!!.projectsList.adapter = projectAdapter
    }

    private fun searchProjectsByName(user: String?)
    {
        try {
            var client: Client = Client()
            var apiService: Service = client.getClient()!!.create(Service::class.java)

            var call: Call<ProjectResponse?>? = apiService.getRepoByName(user)

            call?.enqueue(object: Callback<ProjectResponse?> {

                override fun onResponse(
                    @Nullable call: Call<ProjectResponse?>?,
                    @Nullable response: Response<ProjectResponse?>?
                ) {
                    if (response != null && response.body() != null) {
                        val responserProjects: List<String> = response.body()!!.getItems() as List<String>
                        projects.clear()
                        projects.addAll(responserProjects)
                        projectAdapter!!.notifyDataSetChanged()
                    }
                }

                override fun onFailure(@Nullable call: Call<ProjectResponse?>?, @Nullable t: Throwable?) {
                    if (t != null)
                    {
                        showError()
                    }
                }
            })
        }
        catch (e: Exception)
        {
            Log.d("Exception LoadJSON", e.message.toString())
        }
    }

    private fun showError(){
        Toast.makeText(this, "Ha ocurrido un error", Toast.LENGTH_SHORT).show()
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        if (!query!!.isEmpty())
        {
            searchProjectsByName(query)
        }
        return true
    }

    override fun onQueryTextChange(p0: String?): Boolean {
        return true
    }
}