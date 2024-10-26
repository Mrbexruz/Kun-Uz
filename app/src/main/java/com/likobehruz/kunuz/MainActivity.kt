package com.likobehruz.kunuz

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.likobehruz.kunuz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.txt1.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.google.com/search?q=copa+america+winners+list&sca_esv=c0f137e23ef54b4f&sca_upv=1&sxsrf=ADLYWIJTtAeAwwl6v3evUF_EzRU-3Rc8Ig%3A1721924294137&ei=xnqiZsSJCLWPwPAP_Omw0Ag&oq=copa+america&gs_lp=Egxnd3Mtd2l6LXNlcnAiDGNvcGEgYW1lcmljYSoCCAIyChAAGLADGNYEGEcyChAAGLADGNYEGEcyChAAGLADGNYEGEcyChAAGLADGNYEGEcyChAAGLADGNYEGEcyChAAGLADGNYEGEcyChAAGLADGNYEGEcyChAAGLADGNYEGEcyDRAAGIAEGLADGEMYigUyDRAAGIAEGLADGEMYigVIyS9QAFgAcAF4AZABAJgBAKABAKoBALgBAcgBAJgCAaACCpgDAIgGAZAGCpIHATGgBwA&sclient=gws-wiz-serp")
            startActivity(intent)
        }
        binding.txt2.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.google.com/search?q=mbappe+real+madrid&sca_esv=c0f137e23ef54b4f&udm=2&biw=1536&bih=695&sxsrf=ADLYWIIpqEMUQacxDtE83IDubU6vm2ZXqw%3A1721924673894&ei=QXyiZsikNt-xwPAPoq2j0Qo&oq=mbappe+r&gs_lp=Egxnd3Mtd2l6LXNlcnAiCG1iYXBwZSByKgIIATIEECMYJzIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABEiFggFQ-QNY_2hwBngAkAEEmAHXAqAByROqAQgwLjE1LjAuMbgBAcgBAPgBAZgCEqACxQ-oAgrCAgQQABgewgIHECMYJxjqAsICChAAGIAEGEMYigXCAgYQABgFGB7CAgYQABgIGB7CAgcQABiABBgYmAMOiAYBkgcINi4xMS4wLjGgB9Bu&sclient=gws-wiz-serp")
            startActivity(intent)

        }
        binding.txt3.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.google.com/search?q=champion+of+euro+2024&sca_esv=c0f137e23ef54b4f&sca_upv=1&sxsrf=ADLYWIJOJUVMLKzMkV1n5_sOYMX771pCEw%3A1721925014284&ei=ln2iZvyNEefdwPAP2aKCmAQ&ved=0ahUKEwj8sLnGzsKHAxXnLhAIHVmRAEMQ4dUDCA8&oq=champion+of+euro+2024&gs_lp=Egxnd3Mtd2l6LXNlcnAiFWNoYW1waW9uIG9mIGV1cm8gMjAyNDIKEAAYsAMY1gQYRzIKEAAYsAMY1gQYRzIKEAAYsAMY1gQYRzIKEAAYsAMY1gQYRzIKEAAYsAMY1gQYRzIKEAAYsAMY1gQYRzIKEAAYsAMY1gQYRzIKEAAYsAMY1gQYR0ifC1AAWABwAXgBkAEAmAEAoAEAqgEAuAEMyAEAmAIBoAIOmAMAiAYBkAYIkgcBMaAHAA&sclient=gws-wiz-serp")
            startActivity(intent)

        }

        binding.txt4.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.instagram.com/reel/C9oZpF2oJ_P/?igsh=Nm95MDR6NHNtM3Vj")
            startActivity(intent)


        }

        binding.txt5.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://t.me/hamster_kombat_bOt/start?startapp=kentId1258813214")
            startActivity(intent)

        }
        binding.imgi.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.geogle.com")
            startActivity(intent)
        }
        binding.kunid.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.youtube.com/")
            startActivity(intent)
        }

    }
}

